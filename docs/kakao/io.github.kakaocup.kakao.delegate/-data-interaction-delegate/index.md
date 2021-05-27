//[kakao](../../../index.md)/[io.github.kakaocup.kakao.delegate](../index.md)/[DataInteractionDelegate](index.md)



# DataInteractionDelegate  
 [androidJvm] class [DataInteractionDelegate](index.md)(**interaction**: DataInteraction) : [Delegate](../-delegate/index.md)<DataInteraction, ViewAssertion, ViewAction> 

Delegation class for DataInteraction. Wraps all available public calls and intercepts [check](check.md) and [perform](perform.md).

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.delegate.Delegate](../-delegate/index.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate///PointingToDeclaration/"></a>|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.intercept.Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/DataInteractionDelegate/#androidx.test.espresso.DataInteraction/PointingToDeclaration/"></a>[DataInteractionDelegate](-data-interaction-delegate.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/DataInteractionDelegate/#androidx.test.espresso.DataInteraction/PointingToDeclaration/"></a> [androidJvm] fun [DataInteractionDelegate](-data-interaction-delegate.md)(interaction: DataInteraction)   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/atPosition/#kotlin.Int/PointingToDeclaration/"></a>[atPosition](at-position.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/atPosition/#kotlin.Int/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@Contract(value = _->this)  <br>  <br>fun [atPosition](at-position.md)(atPosition: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [DataInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/check/#androidx.test.espresso.ViewAssertion/PointingToDeclaration/"></a>[check](check.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/check/#androidx.test.espresso.ViewAssertion/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [check](check.md)(viewAssert: ViewAssertion): [ViewInteractionDelegate](../-view-interaction-delegate/index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/inAdapterView/#org.hamcrest.Matcher[android.view.View]/PointingToDeclaration/"></a>[inAdapterView](in-adapter-view.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/inAdapterView/#org.hamcrest.Matcher[android.view.View]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@Contract(value = _->this)  <br>  <br>fun [inAdapterView](in-adapter-view.md)(adapterMatcher: Matcher<[View](https://developer.android.com/reference/kotlin/android/view/View.html)>): [DataInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/inRoot/#org.hamcrest.Matcher[androidx.test.espresso.Root]/PointingToDeclaration/"></a>[inRoot](in-root.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/inRoot/#org.hamcrest.Matcher[androidx.test.espresso.Root]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@Contract(value = _->this)  <br>  <br>fun [inRoot](in-root.md)(rootMatcher: Matcher<Root>): [DataInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptCheck/#androidx.test.espresso.ViewAssertion/PointingToDeclaration/"></a>[interceptCheck](../-view-interaction-delegate/index.md#-642599236%2FFunctions%2F34310170)| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptCheck/#androidx.test.espresso.ViewAssertion/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [interceptCheck](../-view-interaction-delegate/index.md#-642599236%2FFunctions%2F34310170)(assertion: ViewAssertion): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Runs the interceptors available for the given delegate during the check operation.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptPerform/#androidx.test.espresso.ViewAction/PointingToDeclaration/"></a>[interceptPerform](../-view-interaction-delegate/index.md#-96531673%2FFunctions%2F34310170)| <a name="io.github.kakaocup.kakao.delegate/Delegate/interceptPerform/#androidx.test.espresso.ViewAction/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [interceptPerform](../-view-interaction-delegate/index.md#-96531673%2FFunctions%2F34310170)(action: ViewAction): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Runs the interceptors available for the given delegate during the perform operation.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/kakaoInterceptor/#/PointingToDeclaration/"></a>[kakaoInterceptor](kakao-interceptor.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/kakaoInterceptor/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [kakaoInterceptor](kakao-interceptor.md)(): [Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)<DataInteraction, ViewAssertion, ViewAction>?  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/onChildView/#org.hamcrest.Matcher[android.view.View]/PointingToDeclaration/"></a>[onChildView](on-child-view.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/onChildView/#org.hamcrest.Matcher[android.view.View]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@Contract(value = _->this)  <br>  <br>fun [onChildView](on-child-view.md)(childMatcher: Matcher<[View](https://developer.android.com/reference/kotlin/android/view/View.html)>): [DataInteractionDelegate](index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/perform/#kotlin.Array[androidx.test.espresso.ViewAction]/PointingToDeclaration/"></a>[perform](perform.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/perform/#kotlin.Array[androidx.test.espresso.ViewAction]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [perform](perform.md)(vararg viewActions: ViewAction): [ViewInteractionDelegate](../-view-interaction-delegate/index.md)  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/screenInterceptors/#/PointingToDeclaration/"></a>[screenInterceptors](screen-interceptors.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/screenInterceptors/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [screenInterceptors](screen-interceptors.md)(): [Deque](https://developer.android.com/reference/kotlin/java/util/Deque.html)<[Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)<DataInteraction, ViewAssertion, ViewAction>>  <br><br><br>|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/usingAdapterViewProtocol/#androidx.test.espresso.action.AdapterViewProtocol/PointingToDeclaration/"></a>[usingAdapterViewProtocol](using-adapter-view-protocol.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/usingAdapterViewProtocol/#androidx.test.espresso.action.AdapterViewProtocol/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>@Contract(value = _->this)  <br>  <br>fun [usingAdapterViewProtocol](using-adapter-view-protocol.md)(adapterViewProtocol: AdapterViewProtocol): [DataInteractionDelegate](index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/interaction/#/PointingToDeclaration/"></a>[interaction](interaction.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/interaction/#/PointingToDeclaration/"></a> [androidJvm] open override var [interaction](interaction.md): DataInteraction   <br>|
| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/interceptor/#/PointingToDeclaration/"></a>[interceptor](interceptor.md)| <a name="io.github.kakaocup.kakao.delegate/DataInteractionDelegate/interceptor/#/PointingToDeclaration/"></a> [androidJvm] open override var [interceptor](interceptor.md): [Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)<DataInteraction, ViewAssertion, ViewAction>? = null   <br>|

