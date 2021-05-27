//[kakao](../../../../index.md)/[io.github.kakaocup.kakao.intercept](../../index.md)/[Interceptor](../index.md)/[Configurator](index.md)



# Configurator  
 [androidJvm] class [Configurator](index.md)

Configuration class that is used for building interceptors on the [Kakao](../../../io.github.kakaocup.kakao/-kakao/index.md) runtime and [Screen](../../../io.github.kakaocup.kakao.screen/-screen/index.md) levels.

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.Kakao](../../../io.github.kakaocup.kakao/-kakao/index.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.screen.Screen](../../../io.github.kakaocup.kakao.screen/-screen/index.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator/Configurator/#/PointingToDeclaration/"></a>[Configurator](-configurator.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator/Configurator/#/PointingToDeclaration/"></a> [androidJvm] fun [Configurator](-configurator.md)()   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator/onDataInteraction/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Builder[androidx.test.espresso.DataInteraction,androidx.test.espresso.ViewAssertion,androidx.test.espresso.ViewAction],kotlin.Unit]/PointingToDeclaration/"></a>[onDataInteraction](on-data-interaction.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator/onDataInteraction/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Builder[androidx.test.espresso.DataInteraction,androidx.test.espresso.ViewAssertion,androidx.test.espresso.ViewAction],kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [onDataInteraction](on-data-interaction.md)(builder: [Interceptor.Builder](../-builder/index.md)<DataInteraction, ViewAssertion, ViewAction>.() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Setups the interceptor for check and perform operations happening through DataInteraction  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator/onViewInteraction/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Builder[androidx.test.espresso.ViewInteraction,androidx.test.espresso.ViewAssertion,androidx.test.espresso.ViewAction],kotlin.Unit]/PointingToDeclaration/"></a>[onViewInteraction](on-view-interaction.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator/onViewInteraction/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Builder[androidx.test.espresso.ViewInteraction,androidx.test.espresso.ViewAssertion,androidx.test.espresso.ViewAction],kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [onViewInteraction](on-view-interaction.md)(builder: [Interceptor.Builder](../-builder/index.md)<ViewInteraction, ViewAssertion, ViewAction>.() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Setups the interceptor for check and perform operations happening through ViewInteraction  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator/onWebInteraction/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Builder[androidx.test.espresso.web.sugar.Web.WebInteraction[*],androidx.test.espresso.web.assertion.WebAssertion[*],androidx.test.espresso.web.model.Atom[*]],kotlin.Unit]/PointingToDeclaration/"></a>[onWebInteraction](on-web-interaction.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptor.Configurator/onWebInteraction/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Builder[androidx.test.espresso.web.sugar.Web.WebInteraction[*],androidx.test.espresso.web.assertion.WebAssertion[*],androidx.test.espresso.web.model.Atom[*]],kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [onWebInteraction](on-web-interaction.md)(builder: [Interceptor.Builder](../-builder/index.md)<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>.() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Setups the interceptor for check and perform operations happening through Web.WebInteraction  <br><br><br>|

