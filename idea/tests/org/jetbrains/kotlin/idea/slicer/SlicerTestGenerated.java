/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.slicer;

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
@TestMetadata("idea/testData/slicer")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SlicerTestGenerated extends AbstractSlicerTest {
    public void testAllFilesPresentInSlicer() throws Exception {
        KotlinTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/slicer"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY);
    }

    @TestMetadata("inflow/cast.kt")
    public void testInflow_Cast() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/cast.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/funParamerer.kt")
    public void testInflow_FunParamerer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/funParamerer.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/funParamererWithDefault.kt")
    public void testInflow_FunParamererWithDefault() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/funParamererWithDefault.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/funWithExpressionBody.kt")
    public void testInflow_FunWithExpressionBody() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/funWithExpressionBody.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/funWithReturnExpressions.kt")
    public void testInflow_FunWithReturnExpressions() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/funWithReturnExpressions.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/ifExpression.kt")
    public void testInflow_IfExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/ifExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/localVal.kt")
    public void testInflow_LocalVal() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/localVal.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/localVar.kt")
    public void testInflow_LocalVar() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/localVar.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/memberValWithInitializer.kt")
    public void testInflow_MemberValWithInitializer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/memberValWithInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/memberValWithSplitInitializer.kt")
    public void testInflow_MemberValWithSplitInitializer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/memberValWithSplitInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/memberVarWithInitializer.kt")
    public void testInflow_MemberVarWithInitializer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/memberVarWithInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/memberVarWithSplitInitializer.kt")
    public void testInflow_MemberVarWithSplitInitializer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/memberVarWithSplitInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/notNullAssertion.kt")
    public void testInflow_NotNullAssertion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/notNullAssertion.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/primaryConstructorParameter.kt")
    public void testInflow_PrimaryConstructorParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/primaryConstructorParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/primaryConstructorParameterWithDefault.kt")
    public void testInflow_PrimaryConstructorParameterWithDefault() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/primaryConstructorParameterWithDefault.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/safeCast.kt")
    public void testInflow_SafeCast() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/safeCast.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/secondaryConstructorParameter.kt")
    public void testInflow_SecondaryConstructorParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/secondaryConstructorParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/secondaryConstructorParameterWithDefault.kt")
    public void testInflow_SecondaryConstructorParameterWithDefault() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/secondaryConstructorParameterWithDefault.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/topLevelVal.kt")
    public void testInflow_TopLevelVal() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/topLevelVal.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/topLevelVar.kt")
    public void testInflow_TopLevelVar() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/topLevelVar.kt");
        doTest(fileName);
    }

    @TestMetadata("inflow/whenExpression.kt")
    public void testInflow_WhenExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/inflow/whenExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/callArgument.kt")
    public void testOutflow_CallArgument() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/callArgument.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/cast.kt")
    public void testOutflow_Cast() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/cast.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/extensionIndexingDereferences.kt")
    public void testOutflow_ExtensionIndexingDereferences() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/extensionIndexingDereferences.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/funBodyExpression.kt")
    public void testOutflow_FunBodyExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/funBodyExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/functionCalls.kt")
    public void testOutflow_FunctionCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/functionCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/funParameterUsages.kt")
    public void testOutflow_FunParameterUsages() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/funParameterUsages.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/funReturnExpression.kt")
    public void testOutflow_FunReturnExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/funReturnExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/ifExpression.kt")
    public void testOutflow_IfExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/ifExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/indexingDereferences.kt")
    public void testOutflow_IndexingDereferences() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/indexingDereferences.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/localVariableUsages.kt")
    public void testOutflow_LocalVariableUsages() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/localVariableUsages.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/memberPropertyUsages.kt")
    public void testOutflow_MemberPropertyUsages() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/memberPropertyUsages.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/notNullAssertion.kt")
    public void testOutflow_NotNullAssertion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/notNullAssertion.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/operatorCallDereferences.kt")
    public void testOutflow_OperatorCallDereferences() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/operatorCallDereferences.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/primaryConstructorCalls.kt")
    public void testOutflow_PrimaryConstructorCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/primaryConstructorCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/primaryConstructorParameterUsages.kt")
    public void testOutflow_PrimaryConstructorParameterUsages() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/primaryConstructorParameterUsages.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/secondaryConstructorCalls.kt")
    public void testOutflow_SecondaryConstructorCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/secondaryConstructorCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/simpleCallDereferences.kt")
    public void testOutflow_SimpleCallDereferences() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/simpleCallDereferences.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/topLevelPropertyUsages.kt")
    public void testOutflow_TopLevelPropertyUsages() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/topLevelPropertyUsages.kt");
        doTest(fileName);
    }

    @TestMetadata("outflow/whenExpression.kt")
    public void testOutflow_WhenExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/slicer/outflow/whenExpression.kt");
        doTest(fileName);
    }
}
