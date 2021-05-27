//[kakao](../../../index.md)/[io.github.kakaocup.kakao.screen](../index.md)/[Screen](index.md)



# Screen  
 [androidJvm] open class [Screen](index.md)<out [T](index.md) : [Screen](index.md)<[T](index.md)>> : [ScreenActions](../-screen-actions/index.md)

Container class for UI elements.



This class groups UI elements and grants access to basic actions, such as tapBack() and closeSoftKeyboard()

   


## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.screen/Screen///PointingToDeclaration/"></a>[io.github.kakaocup.kakao.screen.ScreenActions](../-screen-actions/index.md)| <a name="io.github.kakaocup.kakao.screen/Screen///PointingToDeclaration/"></a>|
  


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.screen/Screen///PointingToDeclaration/"></a>T| <a name="io.github.kakaocup.kakao.screen/Screen///PointingToDeclaration/"></a><br><br>type of your screen, done to enable invoke() for its children<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.screen/Screen/Screen/#/PointingToDeclaration/"></a>[Screen](-screen.md)| <a name="io.github.kakaocup.kakao.screen/Screen/Screen/#/PointingToDeclaration/"></a> [androidJvm] fun [Screen](-screen.md)()type of your screen, done to enable invoke() for its children   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.screen/Screen.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="io.github.kakaocup.kakao.screen/Screen.Companion///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.screen/ScreenActions/closeSoftKeyboard/#/PointingToDeclaration/"></a>[closeSoftKeyboard](../-screen-actions/close-soft-keyboard.md)| <a name="io.github.kakaocup.kakao.screen/ScreenActions/closeSoftKeyboard/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [closeSoftKeyboard](../-screen-actions/close-soft-keyboard.md)()  <br>More info  <br>Closes soft keyboard, if opened  <br><br><br>|
| <a name="io.github.kakaocup.kakao.screen/Screen/intercept/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Configurator,kotlin.Unit]/PointingToDeclaration/"></a>[intercept](intercept.md)| <a name="io.github.kakaocup.kakao.screen/Screen/intercept/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Configurator,kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [intercept](intercept.md)(configurator: [Interceptor.Configurator](../../io.github.kakaocup.kakao.intercept/-interceptor/-configurator/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Sets the interceptors for the screen.  <br><br><br>|
| <a name="io.github.kakaocup.kakao.screen/Screen/invoke/#kotlin.Function1[TypeParam(bounds=[io.github.kakaocup.kakao.screen.Screen[^]]),kotlin.Unit]/PointingToDeclaration/"></a>[invoke](invoke.md)| <a name="io.github.kakaocup.kakao.screen/Screen/invoke/#kotlin.Function1[TypeParam(bounds=[io.github.kakaocup.kakao.screen.Screen[^]]),kotlin.Unit]/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>operator fun [invoke](invoke.md)(function: [T](index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  <br>More info  <br>Operator that allows usage of DSL style  <br><br><br>|
| <a name="io.github.kakaocup.kakao.screen/ScreenActions/pressBack/#/PointingToDeclaration/"></a>[pressBack](../-screen-actions/press-back.md)| <a name="io.github.kakaocup.kakao.screen/ScreenActions/pressBack/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [pressBack](../-screen-actions/press-back.md)()  <br>More info  <br>Performs click on device's back button  <br><br><br>|
| <a name="io.github.kakaocup.kakao.screen/ScreenActions/pressKey/#androidx.test.espresso.action.EspressoKey/PointingToDeclaration/"></a>[pressKey](../-screen-actions/press-key.md)| <a name="io.github.kakaocup.kakao.screen/ScreenActions/pressKey/#androidx.test.espresso.action.EspressoKey/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [pressKey](../-screen-actions/press-key.md)(key: EspressoKey)  <br>More info  <br>Presses a key with correspondingKeyCode and modifiers  <br><br><br>[androidJvm]  <br>Content  <br>open fun [pressKey](../-screen-actions/press-key.md)(keyCode: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Presses a key with corresponding KeyCode  <br><br><br>|
| <a name="io.github.kakaocup.kakao.screen/ScreenActions/pressMenuKey/#/PointingToDeclaration/"></a>[pressMenuKey](../-screen-actions/press-menu-key.md)| <a name="io.github.kakaocup.kakao.screen/ScreenActions/pressMenuKey/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [pressMenuKey](../-screen-actions/press-menu-key.md)()  <br>More info  <br>Presses the hardware menu key  <br><br><br>|
| <a name="io.github.kakaocup.kakao.screen/Screen/reset/#/PointingToDeclaration/"></a>[reset](reset.md)| <a name="io.github.kakaocup.kakao.screen/Screen/reset/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [reset](reset.md)()  <br>More info  <br>Removes the interceptors from the screen.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.screen/Screen/rootView/#/PointingToDeclaration/"></a>[rootView](root-view.md)| <a name="io.github.kakaocup.kakao.screen/Screen/rootView/#/PointingToDeclaration/"></a> [androidJvm] open var [rootView](root-view.md): [KBaseView](../../io.github.kakaocup.kakao.common.views/-k-base-view/index.md)<*>? = nullThe visibility of rootView will be checked when entering the screen   <br>|
| <a name="io.github.kakaocup.kakao.screen/Screen/view/#/PointingToDeclaration/"></a>[view](view.md)| <a name="io.github.kakaocup.kakao.screen/Screen/view/#/PointingToDeclaration/"></a> [androidJvm] open override val [view](view.md): [ViewInteractionDelegate](../../io.github.kakaocup.kakao.delegate/-view-interaction-delegate/index.md)ViewInteractionDelegate on which all actions are performed (root view by default)   <br>|

