//[kakao](../../../index.md)/[io.github.kakaocup.kakao.web](../index.md)/[WebAssertions](index.md)



# WebAssertions  
 [androidJvm] interface [WebAssertions](index.md)

Interface that provides assertions for WebViews

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.web/WebAssertions/containsText/#kotlin.String/PointingToDeclaration/"></a>[containsText](contains-text.md)| <a name="io.github.kakaocup.kakao.web/WebAssertions/containsText/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [containsText](contains-text.md)(text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Checks if element contains given text  <br><br><br>|
| <a name="io.github.kakaocup.kakao.web/WebAssertions/hasText/#kotlin.String/PointingToDeclaration/"></a>[hasText](has-text.md)| <a name="io.github.kakaocup.kakao.web/WebAssertions/hasText/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hasText](has-text.md)(text: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Checks if element has given text  <br><br><br>|
| <a name="io.github.kakaocup.kakao.web/WebAssertions/matches/#androidx.test.espresso.web.model.Atom[TypeParam(bounds=[kotlin.Any?])]#org.hamcrest.Matcher[TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[matches](matches.md)| <a name="io.github.kakaocup.kakao.web/WebAssertions/matches/#androidx.test.espresso.web.model.Atom[TypeParam(bounds=[kotlin.Any?])]#org.hamcrest.Matcher[TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun <[T](matches.md)> [matches](matches.md)(value: Atom<[T](matches.md)>, matcher: Matcher<[T](matches.md)>)  <br>More info  <br>Checks if element matches given matcher  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.web/WebAssertions/ref/#/PointingToDeclaration/"></a>[ref](ref.md)| <a name="io.github.kakaocup.kakao.web/WebAssertions/ref/#/PointingToDeclaration/"></a> [androidJvm] abstract val [ref](ref.md): Atom<ElementReference>   <br>|
| <a name="io.github.kakaocup.kakao.web/WebAssertions/web/#/PointingToDeclaration/"></a>[web](web.md)| <a name="io.github.kakaocup.kakao.web/WebAssertions/web/#/PointingToDeclaration/"></a> [androidJvm] abstract val [web](web.md): [WebInteractionDelegate](../../io.github.kakaocup.kakao.delegate/-web-interaction-delegate/index.md)   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="io.github.kakaocup.kakao.web/WebElementBuilder.KWebInteraction///PointingToDeclaration/"></a>[WebElementBuilder](../-web-element-builder/-k-web-interaction/index.md)|

