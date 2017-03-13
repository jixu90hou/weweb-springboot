package demo;

import utils.TypeUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wshen on 3/6/2017.
 */
public class TestBigDecimal {
	public static void main(String[] args)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		BigDecimalEntity bigDecimalEntity = new BigDecimalEntity();
		List<InnerEntity> innerEntityList = new ArrayList<>();
		List<InnerInnerEntity> innerInnerEntities = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			InnerInnerEntity innerInnerEntity = new InnerInnerEntity();
			innerInnerEntity.setBigDecimal(new BigDecimal(222 + i));
			innerInnerEntity.setName("zhang" + 3 * (i + 1));
			innerInnerEntities.add(innerInnerEntity);
		}
		for (int i = 0; i < 3; i++) {
			InnerEntity innerEntity = new InnerEntity();
			innerEntity.setInnerAa(new BigDecimal(i));
			innerEntity.setInnerBb(new BigDecimal(100 + i));
			innerEntity.setInnerString("zhang" + i);
			innerEntity.setInnerInnerEntities(innerInnerEntities);
			innerEntityList.add(innerEntity);
		}
		bigDecimalEntity.setAa(new BigDecimal(10));
		bigDecimalEntity.setBb(new BigDecimal(20));
		bigDecimalEntity.setCc(new BigDecimal(30));
		bigDecimalEntity.setaString("wang");
		bigDecimalEntity.setInnerEntities(innerEntityList);
		System.out.println(bigDecimalEntity);
		TypeUtils.handleBigDecimal(bigDecimalEntity);
		System.out.println(bigDecimalEntity);
	}

}
