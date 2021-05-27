//[kakao](../../../index.md)/[io.github.kakaocup.kakao.intent](../index.md)/[KIntent](index.md)



# KIntent  
 [androidJvm] class [KIntent](index.md)(**builder**: [IntentBuilder](../-intent-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))

This class is intended to be used when you need to check if some intent has been sent or to mock specific intent with result

   


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intent/KIntent///PointingToDeclaration/"></a>builder| <a name="io.github.kakaocup.kakao.intent/KIntent///PointingToDeclaration/"></a><br><br>Builder for intent matching<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intent/KIntent/KIntent/#kotlin.Function1[io.github.kakaocup.kakao.intent.IntentBuilder,kotlin.Unit]/PointingToDeclaration/"></a>[KIntent](-k-intent.md)| <a name="io.github.kakaocup.kakao.intent/KIntent/KIntent/#kotlin.Function1[io.github.kakaocup.kakao.intent.IntentBuilder,kotlin.Unit]/PointingToDeclaration/"></a> [androidJvm] fun [KIntent](-k-intent.md)(builder: [IntentBuilder](../-intent-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))Builder for intent matching   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.intent/KIntent/intended/#androidx.test.espresso.intent.VerificationMode?/PointingToDeclaration/"></a>[intended](intended.md)| <a name="io.github.kakaocup.kakao.intent/KIntent/intended/#androidx.test.espresso.intent.VerificationMode?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [intended](intended.md)(verificationMode: VerificationMode? = null)  <br>More info  <br>Checks if this intent has been sent previously  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/KIntent/intending/#android.app.Instrumentation.ActivityResult?/PointingToDeclaration/"></a>[intending](intending.md)| <a name="io.github.kakaocup.kakao.intent/KIntent/intending/#android.app.Instrumentation.ActivityResult?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [intending](intending.md)(result: [Instrumentation.ActivityResult](https://developer.android.com/reference/kotlin/android/app/Instrumentation.ActivityResult.html)? = null)  <br>fun [intending](intending.md)(result: [ActivityResultBuilder](../-activity-result-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Mocks next coming intent that will match with provided result.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/KIntent/invoke/#kotlin.Function1[io.github.kakaocup.kakao.intent.KIntent,kotlin.Unit]/PointingToDeclaration/"></a>[invoke](invoke.md)| <a name="io.github.kakaocup.kakao.intent/KIntent/invoke/#kotlin.Function1[io.github.kakaocup.kakao.intent.KIntent,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [invoke](invoke.md)(function: [KIntent](index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br><br><br>|

