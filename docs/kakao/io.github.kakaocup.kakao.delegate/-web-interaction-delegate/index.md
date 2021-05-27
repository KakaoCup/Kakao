//[kakao](../../../index.md)/[io.github.kakaocup.kakao.delegate](../index.md)/[WebInteractionDelegate](index.md)



# WebInteractionDelegate  
 [androidJvm] class [WebInteractionDelegate](index.md)(**interaction**: Web.WebInteraction<*>) : [Delegate](../-delegate/index.md)<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>> 

Delegation class for Web.WebInteraction. Wraps all available public calls and intercepts [check](check.md) and [perform](perform.md).

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.delegate.Delegate](../-delegate/index.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.intercept.Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/WebInteractionDelegate/#androidx.test.espresso.web.sugar.Web.WebInteraction[*]/PointingToDeclaration/"></a>[WebInteractionDelegate](-web-interaction-delegate.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/WebInteractionDelegate/#androidx.test.espresso.web.sugar.Web.WebInteraction[*]/PointingToDeclaration/"></a> [androidJvm] fun [WebInteractionDelegate](-web-interaction-delegate.md)(interaction: Web.WebInteraction<*>)   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/check/#androidx.test.espresso.web.assertion.WebAssertion[*]/PointingToDeclaration/"></a>[check](check.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/check/#androidx.test.espresso.web.assertion.WebAssertion[*]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [check](check.md)(assertion: WebAssertion<*>): [WebInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/forceJavascriptEnabled/#/PointingToDeclaration/"></a>[forceJavascriptEnabled](force-javascript-enabled.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/forceJavascriptEnabled/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [forceJavascriptEnabled](force-javascript-enabled.md)(): [WebInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/get/#/PointingToDeclaration/"></a>[get](get.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/get/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [get](get.md)(): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptCheck/#androidx.test.espresso.web.assertion.WebAssertion[*]/PointingToDeclaration/"></a>[interceptCheck](index.md#949162687%2FFunctions%2F34310170)| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptCheck/#androidx.test.espresso.web.assertion.WebAssertion[*]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [interceptCheck](index.md#949162687%2FFunctions%2F34310170)(assertion: WebAssertion<*>): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Runs the interceptors available for the given delegate during the check operation.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptPerform/#androidx.test.espresso.web.model.Atom[*]/PointingToDeclaration/"></a>[interceptPerform](index.md#-1152213694%2FFunctions%2F34310170)| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptPerform/#androidx.test.espresso.web.model.Atom[*]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [interceptPerform](index.md#-1152213694%2FFunctions%2F34310170)(action: Atom<*>): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Runs the interceptors available for the given delegate during the perform operation.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/inWindow/#androidx.test.espresso.web.model.Atom[androidx.test.espresso.web.model.WindowReference]/PointingToDeclaration/"></a>[inWindow](in-window.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/inWindow/#androidx.test.espresso.web.model.Atom[androidx.test.espresso.web.model.WindowReference]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [inWindow](in-window.md)(windowPicker: Atom<WindowReference>): [WebInteractionDelegate](index.md)  <br>fun [inWindow](in-window.md)(window: WindowReference): [WebInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/kakaoInterceptor/#/PointingToDeclaration/"></a>[kakaoInterceptor](kakao-interceptor.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/kakaoInterceptor/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [kakaoInterceptor](kakao-interceptor.md)(): [Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>?  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/perform/#androidx.test.espresso.web.model.Atom[*]/PointingToDeclaration/"></a>[perform](perform.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/perform/#androidx.test.espresso.web.model.Atom[*]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [perform](perform.md)(atom: Atom<*>): [WebInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/reset/#/PointingToDeclaration/"></a>[reset](reset.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/reset/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [reset](reset.md)(): [WebInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/screenInterceptors/#/PointingToDeclaration/"></a>[screenInterceptors](screen-interceptors.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/screenInterceptors/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [screenInterceptors](screen-interceptors.md)(): [Deque](https://developer.android.com/reference/kotlin/java/util/Deque.html)<[Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>>  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/withContextualElement/#androidx.test.espresso.web.model.Atom[androidx.test.espresso.web.model.ElementReference]/PointingToDeclaration/"></a>[withContextualElement](with-contextual-element.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/withContextualElement/#androidx.test.espresso.web.model.Atom[androidx.test.espresso.web.model.ElementReference]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [withContextualElement](with-contextual-element.md)(elementPicker: Atom<ElementReference>): [WebInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/withElement/#androidx.test.espresso.web.model.Atom[androidx.test.espresso.web.model.ElementReference]/PointingToDeclaration/"></a>[withElement](with-element.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/withElement/#androidx.test.espresso.web.model.Atom[androidx.test.espresso.web.model.ElementReference]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [withElement](with-element.md)(elementPicker: Atom<ElementReference>): [WebInteractionDelegate](index.md)  <br>fun [withElement](with-element.md)(element: ElementReference): [WebInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/withNoTimeout/#/PointingToDeclaration/"></a>[withNoTimeout](with-no-timeout.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/withNoTimeout/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [withNoTimeout](with-no-timeout.md)(): [WebInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/withTimeout/#kotlin.Long#java.util.concurrent.TimeUnit/PointingToDeclaration/"></a>[withTimeout](with-timeout.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/withTimeout/#kotlin.Long#java.util.concurrent.TimeUnit/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [withTimeout](with-timeout.md)(amount: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), unit: [TimeUnit](https://developer.android.com/reference/kotlin/java/util/concurrent/TimeUnit.html)): [WebInteractionDelegate](index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/interaction/#/PointingToDeclaration/"></a>[interaction](interaction.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/interaction/#/PointingToDeclaration/"></a> [androidJvm] open override var [interaction](interaction.md): Web.WebInteraction<*>   <br>|
| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/interceptor/#/PointingToDeclaration/"></a>[interceptor](interceptor.md)| <a name="io.github.kakaocup.kakao.delegate/WebInteractionDelegate/interceptor/#/PointingToDeclaration/"></a> [androidJvm] open override var [interceptor](interceptor.md): [Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)<Web.WebInteraction<*>, WebAssertion<*>, Atom<*>>? = null   <br>|

