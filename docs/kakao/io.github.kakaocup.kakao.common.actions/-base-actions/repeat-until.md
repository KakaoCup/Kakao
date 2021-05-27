//[kakao](../../../index.md)/[io.github.kakaocup.kakao.common.actions](../index.md)/[BaseActions](index.md)/[repeatUntil](repeat-until.md)



# repeatUntil  
[androidJvm]  
Content  
open fun [repeatUntil](repeat-until.md)(maxAttempts: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, action: () -> ViewAction, matcher: [ViewBuilder](../../io.github.kakaocup.kakao.common.builders/-view-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Repeats given action on the view until this view will match the given matcher



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>androidx.test.espresso.action.ViewActions| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>|
  


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>maxAttempts| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a><br><br>Maximum repeat count of the action<br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>action| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a><br><br>Action to be performed<br><br>|
| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a>matcher| <a name="io.github.kakaocup.kakao.common.actions/BaseActions/repeatUntil/#kotlin.Int#kotlin.Function0[androidx.test.espresso.ViewAction]#kotlin.Function1[io.github.kakaocup.kakao.common.builders.ViewBuilder,kotlin.Unit]/PointingToDeclaration/"></a><br><br>ViewBuilder that will be used as matcher<br><br>|
  
  



