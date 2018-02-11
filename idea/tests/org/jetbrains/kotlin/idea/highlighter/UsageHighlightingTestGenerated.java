/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.highlighter;

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
@TestMetadata("idea/testData/usageHighlighter")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class UsageHighlightingTestGenerated extends AbstractUsageHighlightingTest {
    public void testAllFilesPresentInUsageHighlighter() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/usageHighlighter"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("implicitIt.kt")
    public void testImplicitIt() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/usageHighlighter/implicitIt.kt");
        doTest(fileName);
    }

    @TestMetadata("importAlias.kt")
    public void testImportAlias() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/usageHighlighter/importAlias.kt");
        doTest(fileName);
    }

    @TestMetadata("labeledAnonymousFun.kt")
    public void testLabeledAnonymousFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/usageHighlighter/labeledAnonymousFun.kt");
        doTest(fileName);
    }

    @TestMetadata("labeledLambda.kt")
    public void testLabeledLambda() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/usageHighlighter/labeledLambda.kt");
        doTest(fileName);
    }

    @TestMetadata("labeledLoop.kt")
    public void testLabeledLoop() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/usageHighlighter/labeledLoop.kt");
        doTest(fileName);
    }

    @TestMetadata("localVal.kt")
    public void testLocalVal() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/usageHighlighter/localVal.kt");
        doTest(fileName);
    }
}
