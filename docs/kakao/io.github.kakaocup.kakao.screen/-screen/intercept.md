//[kakao](../../../index.md)/[io.github.kakaocup.kakao.screen](../index.md)/[Screen](index.md)/[intercept](intercept.md)



# intercept  
[androidJvm]  
Content  
fun [intercept](intercept.md)(configurator: [Interceptor.Configurator](../../io.github.kakaocup.kakao.intercept/-interceptor/-configurator/index.md).() -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))  
More info  


Sets the interceptors for the screen. Interceptors will be invoked on all interactions while the screen is active.



The screen is considered active when it is invoked in one of the following ways:

val screen = SomeScreen()  
  
screen { // Active  
    view { click() }  
    ...  
} // Inactive  
  
// OR  
  
onScreen<SomeScreen>() { // Active  
    view { click() }  
    ...  
} // Inactive

If you use nesting screens, all interceptors of the screens that became active will be invoked in LIFO order (using Deque).



## See also  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.screen/Screen/intercept/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Configurator,kotlin.Unit]/PointingToDeclaration/"></a>[io.github.kakaocup.kakao.intercept.Interceptor](../../io.github.kakaocup.kakao.intercept/-interceptor/index.md)| <a name="io.github.kakaocup.kakao.screen/Screen/intercept/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Configurator,kotlin.Unit]/PointingToDeclaration/"></a>|
  


## Parameters  
  
androidJvm  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.screen/Screen/intercept/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Configurator,kotlin.Unit]/PointingToDeclaration/"></a>configurator| <a name="io.github.kakaocup.kakao.screen/Screen/intercept/#kotlin.Function1[io.github.kakaocup.kakao.intercept.Interceptor.Configurator,kotlin.Unit]/PointingToDeclaration/"></a><br><br>Configuration of the interceptors<br><br>|
  
  



