//[kakao](../../../index.md)/[io.github.kakaocup.kakao.web](../index.md)/[WebElementBuilder](index.md)



# WebElementBuilder  
 [androidJvm] class [WebElementBuilder](index.md)(**view**: [WebInteractionDelegate](../../io.github.kakaocup.kakao.delegate/-web-interaction-delegate/index.md)) : [Interceptable](../../io.github.kakaocup.kakao.intercept/-interceptable/index.md)<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>> 

Class for building WebView element matchers

   


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.web/WebElementBuilder///PointingToDeclaration/"></a>web| <a name="io.github.kakaocup.kakao.web/WebElementBuilder///PointingToDeclaration/"></a><br><br>WebInteraction where elements should be matched<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.web/WebElementBuilder/WebElementBuilder/#io.github.kakaocup.kakao.delegate.WebInteractionDelegate/PointingToDeclaration/"></a>[WebElementBuilder](-web-element-builder.md)| <a name="io.github.kakaocup.kakao.web/WebElementBuilder/WebElementBuilder/#io.github.kakaocup.kakao.delegate.WebInteractionDelegate/PointingToDeclaration/"></a> [androidJvm] fun [WebElementBuilder](-web-element-builder.md)(view: [WebInteractionDelegate](../../io.github.kakaocup.kakao.delegate/-web-interaction-delegate/index.md))WebInteraction where elements should be matched   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.web/WebElementBuilder.KWebInteraction///PointingToDeclaration/"></a>[KWebInteraction](-k-web-interaction/index.md)| <a name="io.github.kakaocup.kakao.web/WebElementBuilder.KWebInteraction///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>inner class [KWebInteraction](-k-web-interaction/index.md)(**web**: [WebInteractionDelegate](../../io.github.kakaocup.kakao.delegate/-web-interaction-delegate/index.md), **ref**: Atom<ElementReference>) : [WebActions](../-web-actions/index.md), [WebAssertions](../-web-assertions/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.intercept/Interceptable/intercept/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Builder[androidx.test.espresso.web.sugar.Web.WebInteraction[*],androidx.test.espresso.web.assertion.WebAssertion[*],androidx.test.espresso.web.model.Atom[*]],kotlin.Unit]/PointingToDeclaration/"></a>[intercept](index.md#55669231%2FFunctions%2F34310170)| <a name="io.github.kakaocup.kakao.intercept/Interceptable/intercept/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Builder[androidx.test.espresso.web.sugar.Web.WebInteraction[*],androidx.test.espresso.web.assertion.WebAssertion[*],androidx.test.espresso.web.model.Atom[*]],kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [intercept](index.md#55669231%2FFunctions%2F34310170)(builder: [Interceptor.Builder](../../io.github.kakaocup.kakao.intercept/-interceptor/-builder/index.md)<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>.() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Sets the interceptors for the instance.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intercept/Interceptable/reset/#/PointingToDeclaration/"></a>[reset](../../io.github.kakaocup.kakao.intercept/-interceptable/reset.md)| <a name="io.github.kakaocup.kakao.intercept/Interceptable/reset/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [reset](../../io.github.kakaocup.kakao.intercept/-interceptable/reset.md)()  <br>More info  <br>Removes the interceptors from the instance.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.web/WebElementBuilder/withElement/#androidx.test.espresso.web.webdriver.Locator#kotlin.String#kotlin.Function1[io.github.kakaocup.kakao.web.WebElementBuilder.KWebInteraction,kotlin.Unit]/PointingToDeclaration/"></a>[withElement](with-element.md)| <a name="io.github.kakaocup.kakao.web/WebElementBuilder/withElement/#androidx.test.espresso.web.webdriver.Locator#kotlin.String#kotlin.Function1[io.github.kakaocup.kakao.web.WebElementBuilder.KWebInteraction,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [withElement](with-element.md)(locator: Locator, value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), interaction: [WebElementBuilder.KWebInteraction](-k-web-interaction/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Looks up web view element and performs actions/assertions on it  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.web/WebElementBuilder/view/#/PointingToDeclaration/"></a>[view](view.md)| <a name="io.github.kakaocup.kakao.web/WebElementBuilder/view/#/PointingToDeclaration/"></a> [androidJvm] open override val [view](view.md): [WebInteractionDelegate](../../io.github.kakaocup.kakao.delegate/-web-interaction-delegate/index.md)   <br>|

