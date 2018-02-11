/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight.generate;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/codeInsight/generate/testFrameworkSupport")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class GenerateTestSupportMethodActionTestGenerated extends AbstractGenerateTestSupportMethodActionTest {
    public void testAllFilesPresentInTestFrameworkSupport() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/generate/testFrameworkSupport"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/jUnit4")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class JUnit4 extends AbstractGenerateTestSupportMethodActionTest {
        public void testAllFilesPresentInJUnit4() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/generate/testFrameworkSupport/jUnit4"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("dataMethod.kt")
        public void testDataMethod() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/jUnit4/dataMethod.kt");
            doTest(fileName);
        }

        @TestMetadata("setUp.kt")
        public void testSetUp() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/jUnit4/setUp.kt");
            doTest(fileName);
        }

        @TestMetadata("setUpExists.kt")
        public void testSetUpExists() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/jUnit4/setUpExists.kt");
            doTest(fileName);
        }

        @TestMetadata("setUpOverrides.kt")
        public void testSetUpOverrides() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/jUnit4/setUpOverrides.kt");
            doTest(fileName);
        }

        @TestMetadata("tearDown.kt")
        public void testTearDown() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/jUnit4/tearDown.kt");
            doTest(fileName);
        }

        @TestMetadata("tearDownExists.kt")
        public void testTearDownExists() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/jUnit4/tearDownExists.kt");
            doTest(fileName);
        }

        @TestMetadata("testMethod.kt")
        public void testTestMethod() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/jUnit4/testMethod.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/junit3")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Junit3 extends AbstractGenerateTestSupportMethodActionTest {
        public void testAllFilesPresentInJunit3() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/generate/testFrameworkSupport/junit3"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("setUp.kt")
        public void testSetUp() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/junit3/setUp.kt");
            doTest(fileName);
        }

        @TestMetadata("setUpExists.kt")
        public void testSetUpExists() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/junit3/setUpExists.kt");
            doTest(fileName);
        }

        @TestMetadata("tearDown.kt")
        public void testTearDown() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/junit3/tearDown.kt");
            doTest(fileName);
        }

        @TestMetadata("tearDownExists.kt")
        public void testTearDownExists() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/junit3/tearDownExists.kt");
            doTest(fileName);
        }

        @TestMetadata("testMethod.kt")
        public void testTestMethod() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/junit3/testMethod.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/testNG")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TestNG extends AbstractGenerateTestSupportMethodActionTest {
        public void testAllFilesPresentInTestNG() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/generate/testFrameworkSupport/testNG"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("dataMethod.kt")
        public void testDataMethod() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/testNG/dataMethod.kt");
            doTest(fileName);
        }

        @TestMetadata("setUp.kt")
        public void testSetUp() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/testNG/setUp.kt");
            doTest(fileName);
        }

        @TestMetadata("setUpExists.kt")
        public void testSetUpExists() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/testNG/setUpExists.kt");
            doTest(fileName);
        }

        @TestMetadata("setUpOverrides.kt")
        public void testSetUpOverrides() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/testNG/setUpOverrides.kt");
            doTest(fileName);
        }

        @TestMetadata("tearDown.kt")
        public void testTearDown() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/testNG/tearDown.kt");
            doTest(fileName);
        }

        @TestMetadata("tearDownExists.kt")
        public void testTearDownExists() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/testNG/tearDownExists.kt");
            doTest(fileName);
        }

        @TestMetadata("testMethod.kt")
        public void testTestMethod() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/generate/testFrameworkSupport/testNG/testMethod.kt");
            doTest(fileName);
        }
    }
}
