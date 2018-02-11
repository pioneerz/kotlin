/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.android.quickfix;

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
@TestMetadata("idea/testData/android/quickfix")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AndroidQuickFixMultiFileTestGenerated extends AbstractAndroidQuickFixMultiFileTest {
    public void testAllFilesPresentInQuickfix() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/quickfix"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
    }

    @TestMetadata("idea/testData/android/quickfix/autoImports")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class AutoImports extends AbstractAndroidQuickFixMultiFileTest {
        public void testAllFilesPresentInAutoImports() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/quickfix/autoImports"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("androidRImport.before.Main.kt")
        public void testAndroidRImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/android/quickfix/autoImports/androidRImport.before.Main.kt");
            doTestWithExtraFile(fileName);
        }
    }

    @TestMetadata("idea/testData/android/quickfix/viewConstructor")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ViewConstructor extends AbstractAndroidQuickFixMultiFileTest {
        public void testAllFilesPresentInViewConstructor() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/android/quickfix/viewConstructor"), Pattern.compile("^(\\w+)\\.((before\\.Main\\.\\w+)|(test))$"), TargetBackend.ANY, true);
        }

        @TestMetadata("indirect.before.Main.kt")
        public void testIndirect() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/android/quickfix/viewConstructor/indirect.before.Main.kt");
            doTestWithExtraFile(fileName);
        }

        @TestMetadata("simple.before.Main.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/android/quickfix/viewConstructor/simple.before.Main.kt");
            doTestWithExtraFile(fileName);
        }
    }
}
