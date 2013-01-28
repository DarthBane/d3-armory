package com.sdfteam.d3armory.jsontest;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import com.sdfteam.d3armory.domain.career.CareerProfile;
import com.sdfteam.d3armory.util.NumberFactory;

import flexjson.JSONDeserializer;

public class ArtisanJsonFunctionalTest {
	private static final File CAREER_JSON = new File("example-json/career_profile.json");
	private static final File CAREER_JSON_ZAI = new File("example-json/career_profile_zai.json");

	@Test
	public void testWithFlexJsonExpectSuccess() throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, IOException {
		Map<?, ?> describe = genericDeserialise(CAREER_JSON);
		assertNotNull(describe);
		System.out.println(describe);
	}

	private Map<?, ?> genericDeserialise(File fileToRead) throws IOException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		JSONDeserializer<CareerProfile> deser = new JSONDeserializer<CareerProfile>();
		String file = FileUtils.readFileToString(fileToRead);

		Object artisan = deser.use(Number.class, new NumberFactory()).deserialize(file, CareerProfile.class);
		Map<?, ?> describe = BeanUtils.describe(artisan);
		return describe;
	}
}
