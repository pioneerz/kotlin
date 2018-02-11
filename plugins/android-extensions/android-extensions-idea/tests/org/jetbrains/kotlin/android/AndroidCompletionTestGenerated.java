/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.android;

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
@TestMetadata("plugins/android-extensions/android-extensions-idea/testData/android/completion")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AndroidCompletionTestGenerated extends AbstractAndroidCompletionTest {
    public void testAllFilesPresentInCompletion() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-idea/testData/android/completion"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
    }

    @TestMetadata("fqNameInAttr")
    public void testFqNameInAttr() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/completion/fqNameInAttr/");
        doTest(fileName);
    }

    @TestMetadata("fqNameInAttrFragment")
    public void testFqNameInAttrFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/completion/fqNameInAttrFragment/");
        doTest(fileName);
    }

    @TestMetadata("fqNameInTag")
    public void testFqNameInTag() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/completion/fqNameInTag/");
        doTest(fileName);
    }

    @TestMetadata("fqNameInTagFragment")
    public void testFqNameInTagFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/completion/fqNameInTagFragment/");
        doTest(fileName);
    }

    @TestMetadata("multiFile")
    public void testMultiFile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/completion/multiFile/");
        doTest(fileName);
    }

    @TestMetadata("multiFileFragment")
    public void testMultiFileFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/completion/multiFileFragment/");
        doTest(fileName);
    }

    @TestMetadata("propertiesSimple")
    public void testPropertiesSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/completion/propertiesSimple/");
        doTest(fileName);
    }

    @TestMetadata("propertiesSimpleFragment")
    public void testPropertiesSimpleFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/completion/propertiesSimpleFragment/");
        doTest(fileName);
    }

    @TestMetadata("propertiesSimpleView")
    public void testPropertiesSimpleView() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/completion/propertiesSimpleView/");
        doTest(fileName);
    }

    @TestMetadata("withoutImport")
    public void testWithoutImport() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-idea/testData/android/completion/withoutImport/");
        doTest(fileName);
    }
}
