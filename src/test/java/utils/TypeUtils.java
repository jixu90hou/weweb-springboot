package utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wshen on 3/13/2017.
 */
public class TypeUtils {
	public static void handleBigDecimal(Object bean)
			throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		Class clazz = bean.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			String type = field.getType().getName();
			field.setAccessible(true);
			Object obj = field.get(bean);
			if ("java.math.BigDecimal".equals(type)) {
				field.set(bean, ((BigDecimal) obj).setScale(2, BigDecimal.ROUND_HALF_UP));
			}
			if ("java.util.List".equals(type)) {
				String fieldName = field.getName();
				String firstLetter = String.valueOf(fieldName.charAt(0));
				String methodName = "get" + fieldName.replaceFirst(firstLetter, firstLetter.toUpperCase());
				Method method = clazz.getDeclaredMethod(methodName);
				List list = (List) method.invoke(bean);
				Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					handleBigDecimal(iterator.next());
				}
			}
		}
	}
}
