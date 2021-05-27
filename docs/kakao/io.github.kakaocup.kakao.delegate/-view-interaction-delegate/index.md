//[kakao](../../../index.md)/[io.github.kakaocup.kakao.delegate](../index.md)/[ViewInteractionDelegate](index.md)



# ViewInteractionDelegate  
 [androidJvm] class [ViewInteractionDelegate](index.md)(**interaction**: ViewInteraction) : [Delegate](../-delegate/index.md)<ViewInteraction, ViewAssertion, ViewAction> 

Delegation class for ViewInteraction. Wraps all available public calls and intercepts [check](check.md) and [perform](perform.md).

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.delegate.Delegate](../-delegate/index.md)| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.intercept.Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/ViewInteractionDelegate/#androidx.test.espresso.ViewInteraction/PointingToDeclaration/"></a>[ViewInteractionDelegate](-view-interaction-delegate.md)| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/ViewInteractionDelegate/#androidx.test.espresso.ViewInteraction/PointingToDeclaration/"></a> [androidJvm] fun [ViewInteractionDelegate](-view-interaction-delegate.md)(interaction: ViewInteraction)   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/check/#androidx.test.espresso.ViewAssertion/PointingToDeclaration/"></a>[check](check.md)| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/check/#androidx.test.espresso.ViewAssertion/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@Contract(value = _->this)  <br>  <br>fun [check](check.md)(viewAssert: ViewAssertion): [ViewInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/inRoot/#org.hamcrest.Matcher[androidx.test.espresso.Root]/PointingToDeclaration/"></a>[inRoot](in-root.md)| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/inRoot/#org.hamcrest.Matcher[androidx.test.espresso.Root]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@Contract(value = _->this)  <br>  <br>fun [inRoot](in-root.md)(rootMatcher: Matcher<Root>): [ViewInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptCheck/#androidx.test.espresso.ViewAssertion/PointingToDeclaration/"></a>[interceptCheck](index.md#-642599236%2FFunctions%2F34310170)| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptCheck/#androidx.test.espresso.ViewAssertion/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [interceptCheck](index.md#-642599236%2FFunctions%2F34310170)(assertion: ViewAssertion): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Runs the interceptors available for the given delegate during the check operation.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptPerform/#androidx.test.espresso.ViewAction/PointingToDeclaration/"></a>[interceptPerform](index.md#-96531673%2FFunctions%2F34310170)| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptPerform/#androidx.test.espresso.ViewAction/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [interceptPerform](index.md#-96531673%2FFunctions%2F34310170)(action: ViewAction): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Runs the interceptors available for the given delegate during the perform operation.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/kakaoInterceptor/#/PointingToDeclaration/"></a>[kakaoInterceptor](kakao-interceptor.md)| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/kakaoInterceptor/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [kakaoInterceptor](kakao-interceptor.md)(): [Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)<ViewInteraction, ViewAssertion, ViewAction>?  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/noActivity/#/PointingToDeclaration/"></a>[noActivity](no-activity.md)| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/noActivity/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@Contract(value = _->this)  <br>  <br>fun [noActivity](no-activity.md)(): [ViewInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/perform/#kotlin.Array[androidx.test.espresso.ViewAction]/PointingToDeclaration/"></a>[perform](perform.md)| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/perform/#kotlin.Array[androidx.test.espresso.ViewAction]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@Contract(value = _->this)  <br>  <br>fun [perform](perform.md)(vararg viewActions: ViewAction): [ViewInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/screenInterceptors/#/PointingToDeclaration/"></a>[screenInterceptors](screen-interceptors.md)| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/screenInterceptors/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [screenInterceptors](screen-interceptors.md)(): [Deque](https://developer.android.com/reference/kotlin/java/util/Deque.html)<[Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)<ViewInteraction, ViewAssertion, ViewAction>>  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/withFailureHandler/#androidx.test.espresso.FailureHandler/PointingToDeclaration/"></a>[withFailureHandler](with-failure-handler.md)| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/withFailureHandler/#androidx.test.espresso.FailureHandler/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@Contract(value = _->this)  <br>  <br>fun [withFailureHandler](with-failure-handler.md)(failureHandler: FailureHandler): [ViewInteractionDelegate](index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/interaction/#/PointingToDeclaration/"></a>[interaction](interaction.md)| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/interaction/#/PointingToDeclaration/"></a> [androidJvm] open override var [interaction](interaction.md): ViewInteraction   <br>|
| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/interceptor/#/PointingToDeclaration/"></a>[interceptor](interceptor.md)| <a name="io.github.kakaocup.kakao.delegate/ViewInteractionDelegate/interceptor/#/PointingToDeclaration/"></a> [androidJvm] open override var [interceptor](interceptor.md): [Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)<ViewInteraction, ViewAssertion, ViewAction>? = null   <br>|

