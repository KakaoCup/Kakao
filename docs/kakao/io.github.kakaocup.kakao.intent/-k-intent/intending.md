//[kakao](../../../index.md)/[io.github.kakaocup.kakao.intent](../index.md)/[KIntent](index.md)/[intending](intending.md)



# intending  
[androidJvm]  
Content  
fun [intending](intending.md)(result: [Instrumentation.ActivityResult](https://developer.android.com/reference/kotlin/android/app/Instrumentation.ActivityResult.html)? = null)  
More info  


Mocks next coming intent that will match with provided result. If no result provided as parameter, function will look up default one set via withResult() in IntentBuilder. If none are present, IllegalStateException will be thrown



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intent/KIntent/intending/#android.app.Instrumentation.ActivityResult?/PointingToDeclaration/"></a>[io.github.kakaocup.kakao.intent.IntentBuilder](../-intent-builder/with-result.md)| <a name="io.github.kakaocup.kakao.intent/KIntent/intending/#android.app.Instrumentation.ActivityResult?/PointingToDeclaration/"></a>|
  


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intent/KIntent/intending/#android.app.Instrumentation.ActivityResult?/PointingToDeclaration/"></a>result| <a name="io.github.kakaocup.kakao.intent/KIntent/intending/#android.app.Instrumentation.ActivityResult?/PointingToDeclaration/"></a><br><br>Activity result to return when matched intent is sent. null by default<br><br>|
  


#### Throws  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intent/KIntent/intending/#android.app.Instrumentation.ActivityResult?/PointingToDeclaration/"></a>[kotlin.IllegalStateException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-state-exception/index.html)| <a name="io.github.kakaocup.kakao.intent/KIntent/intending/#android.app.Instrumentation.ActivityResult?/PointingToDeclaration/"></a><br><br>if result is null and default result is not set<br><br>|
  


[androidJvm]  
Content  
fun [intending](intending.md)(result: [ActivityResultBuilder](../-activity-result-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Mocks next coming intent that will match with provided result.



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intent/KIntent/intending/#kotlin.Function1[io.github.kakaocup.kakao.intent.ActivityResultBuilder,kotlin.Unit]/PointingToDeclaration/"></a>result| <a name="io.github.kakaocup.kakao.intent/KIntent/intending/#kotlin.Function1[io.github.kakaocup.kakao.intent.ActivityResultBuilder,kotlin.Unit]/PointingToDeclaration/"></a><br><br>Builder for activity result to return when matching intent is sent<br><br>|
  
  



