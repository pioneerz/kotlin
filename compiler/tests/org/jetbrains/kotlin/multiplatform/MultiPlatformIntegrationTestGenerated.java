/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.multiplatform;

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
@TestMetadata("compiler/testData/multiplatform")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class MultiPlatformIntegrationTestGenerated extends AbstractMultiPlatformIntegrationTest {
    public void testAllFilesPresentInMultiplatform() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/multiplatform"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
    }

    @TestMetadata("compatibleProperties")
    public void testCompatibleProperties() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/compatibleProperties/");
        doTest(fileName);
    }

    @TestMetadata("compilerArguments")
    public void testCompilerArguments() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/compilerArguments/");
        doTest(fileName);
    }

    @TestMetadata("createImplClassInPlatformModule")
    public void testCreateImplClassInPlatformModule() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/createImplClassInPlatformModule/");
        doTest(fileName);
    }

    @TestMetadata("explicitActualOnOverrideOfAbstractMethod")
    public void testExplicitActualOnOverrideOfAbstractMethod() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/explicitActualOnOverrideOfAbstractMethod/");
        doTest(fileName);
    }

    @TestMetadata("genericDeclarations")
    public void testGenericDeclarations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/genericDeclarations/");
        doTest(fileName);
    }

    @TestMetadata("incompatibleCallables")
    public void testIncompatibleCallables() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/incompatibleCallables/");
        doTest(fileName);
    }

    @TestMetadata("incompatibleClasses")
    public void testIncompatibleClasses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/incompatibleClasses/");
        doTest(fileName);
    }

    @TestMetadata("incompatibleFunctions")
    public void testIncompatibleFunctions() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/incompatibleFunctions/");
        doTest(fileName);
    }

    @TestMetadata("incompatibleNestedClasses")
    public void testIncompatibleNestedClasses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/incompatibleNestedClasses/");
        doTest(fileName);
    }

    @TestMetadata("incompatibleProperties")
    public void testIncompatibleProperties() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/incompatibleProperties/");
        doTest(fileName);
    }

    @TestMetadata("incorrectImplInClass")
    public void testIncorrectImplInClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/incorrectImplInClass/");
        doTest(fileName);
    }

    @TestMetadata("jsNameClash")
    public void testJsNameClash() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/jsNameClash/");
        doTest(fileName);
    }

    @TestMetadata("jvmMultifileClass")
    public void testJvmMultifileClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/jvmMultifileClass/");
        doTest(fileName);
    }

    @TestMetadata("missingOverload")
    public void testMissingOverload() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/missingOverload/");
        doTest(fileName);
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/simple/");
        doTest(fileName);
    }

    @TestMetadata("simpleNoImplKeywordOnTopLevelFunction")
    public void testSimpleNoImplKeywordOnTopLevelFunction() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/simpleNoImplKeywordOnTopLevelFunction/");
        doTest(fileName);
    }

    @TestMetadata("weakIncompatibilityWithoutActualModifier")
    public void testWeakIncompatibilityWithoutActualModifier() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/weakIncompatibilityWithoutActualModifier/");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/multiplatform/classScopes")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ClassScopes extends AbstractMultiPlatformIntegrationTest {
        public void testAllFilesPresentInClassScopes() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/multiplatform/classScopes"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("constructorIncorrectSignature")
        public void testConstructorIncorrectSignature() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/classScopes/constructorIncorrectSignature/");
            doTest(fileName);
        }

        @TestMetadata("enumsWithDifferentEntries")
        public void testEnumsWithDifferentEntries() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/classScopes/enumsWithDifferentEntries/");
            doTest(fileName);
        }

        @TestMetadata("fakeOverrides")
        public void testFakeOverrides() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/classScopes/fakeOverrides/");
            doTest(fileName);
        }

        @TestMetadata("functionAndPropertyWithSameName")
        public void testFunctionAndPropertyWithSameName() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/classScopes/functionAndPropertyWithSameName/");
            doTest(fileName);
        }

        @TestMetadata("functionIncorrectSignature")
        public void testFunctionIncorrectSignature() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/classScopes/functionIncorrectSignature/");
            doTest(fileName);
        }

        @TestMetadata("functionIncorrectSignatureFromSuperclass")
        public void testFunctionIncorrectSignatureFromSuperclass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/classScopes/functionIncorrectSignatureFromSuperclass/");
            doTest(fileName);
        }

        @TestMetadata("missingConstructor")
        public void testMissingConstructor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/classScopes/missingConstructor/");
            doTest(fileName);
        }

        @TestMetadata("missingFunction")
        public void testMissingFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/classScopes/missingFunction/");
            doTest(fileName);
        }

        @TestMetadata("simple")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/classScopes/simple/");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/multiplatform/defaultArguments")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DefaultArguments extends AbstractMultiPlatformIntegrationTest {
        public void testAllFilesPresentInDefaultArguments() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/multiplatform/defaultArguments"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("useDefaultArgumentsInDependency")
        public void testUseDefaultArgumentsInDependency() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/defaultArguments/useDefaultArgumentsInDependency/");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/multiplatform/implTypeAlias")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ImplTypeAlias extends AbstractMultiPlatformIntegrationTest {
        public void testAllFilesPresentInImplTypeAlias() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/multiplatform/implTypeAlias"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("discriminateHeaderClassInFavorOfTypeAlias")
        public void testDiscriminateHeaderClassInFavorOfTypeAlias() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/implTypeAlias/discriminateHeaderClassInFavorOfTypeAlias/");
            doTest(fileName);
        }

        @TestMetadata("generic")
        public void testGeneric() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/implTypeAlias/generic/");
            doTest(fileName);
        }

        @TestMetadata("nestedClassesViaTypeAlias")
        public void testNestedClassesViaTypeAlias() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/implTypeAlias/nestedClassesViaTypeAlias/");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/multiplatform/regressions")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Regressions extends AbstractMultiPlatformIntegrationTest {
        public void testAllFilesPresentInRegressions() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/multiplatform/regressions"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("incompatibleClassScopesWithImplTypeAlias")
        public void testIncompatibleClassScopesWithImplTypeAlias() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/regressions/incompatibleClassScopesWithImplTypeAlias/");
            doTest(fileName);
        }

        @TestMetadata("kt17001")
        public void testKt17001() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/multiplatform/regressions/kt17001/");
            doTest(fileName);
        }
    }
}
