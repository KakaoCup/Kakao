//[kakao](../../../index.md)/[io.github.kakaocup.kakao.intent](../index.md)/[IntentBuilder](index.md)/[hasComponent](has-component.md)



# hasComponent  
[androidJvm]  
Content  
fun [hasComponent](has-component.md)(className: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  
More info  


Matches intent which component has given class name



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasComponent/#kotlin.String/PointingToDeclaration/"></a>className| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasComponent/#kotlin.String/PointingToDeclaration/"></a><br><br>Class name to be matched in intent's component<br><br>|
  
  


[androidJvm]  
Content  
fun [hasComponent](has-component.md)(component: [ComponentName](https://developer.android.com/reference/kotlin/android/content/ComponentName.html))  
More info  


Matches intent with given component



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasComponent/#android.content.ComponentName/PointingToDeclaration/"></a>component| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasComponent/#android.content.ComponentName/PointingToDeclaration/"></a><br><br>Component name to be matched<br><br>|
  
  


[androidJvm]  
Content  
fun [hasComponent](has-component.md)(component: Matcher<[ComponentName](https://developer.android.com/reference/kotlin/android/content/ComponentName.html)>)  
More info  


Matches intent with given component



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasComponent/#org.hamcrest.Matcher[android.content.ComponentName]/PointingToDeclaration/"></a>component| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasComponent/#org.hamcrest.Matcher[android.content.ComponentName]/PointingToDeclaration/"></a><br><br>Matcher for component name<br><br>|
  
  


[androidJvm]  
Content  
fun [hasComponent](has-component.md)(function: [ComponentNameBuilder](../-component-name-builder/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Matches intent with given component



## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasComponent/#kotlin.Function1[io.github.kakaocup.kakao.intent.ComponentNameBuilder,kotlin.Unit]/PointingToDeclaration/"></a>function| <a name="io.github.kakaocup.kakao.intent/IntentBuilder/hasComponent/#kotlin.Function1[io.github.kakaocup.kakao.intent.ComponentNameBuilder,kotlin.Unit]/PointingToDeclaration/"></a><br><br>Builder for a component to match<br><br>|
  
  



