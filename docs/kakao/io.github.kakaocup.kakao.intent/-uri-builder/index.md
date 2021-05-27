//[kakao](../../../index.md)/[io.github.kakaocup.kakao.intent](../index.md)/[UriBuilder](index.md)



# UriBuilder  
 [androidJvm] class [UriBuilder](index.md)

Class for building Uri matchers

   


## Constructors  
  
| | |
|---|---|
| <a name="io.github.kakaocup.kakao.intent/UriBuilder/UriBuilder/#/PointingToDeclaration/"></a>[UriBuilder](-uri-builder.md)| <a name="io.github.kakaocup.kakao.intent/UriBuilder/UriBuilder/#/PointingToDeclaration/"></a> [androidJvm] fun [UriBuilder](-uri-builder.md)()   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="io.github.kakaocup.kakao.intent/UriBuilder/getMatcher/#/PointingToDeclaration/"></a>[getMatcher](get-matcher.md)| <a name="io.github.kakaocup.kakao.intent/UriBuilder/getMatcher/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [getMatcher](get-matcher.md)(): Matcher<[Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html)>  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/UriBuilder/hasHost/#kotlin.String/PointingToDeclaration/"></a>[hasHost](has-host.md)| <a name="io.github.kakaocup.kakao.intent/UriBuilder/hasHost/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasHost](has-host.md)(host: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>fun [hasHost](has-host.md)(host: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>More info  <br>Matches uri with given host  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/UriBuilder/hasParamWithName/#kotlin.String/PointingToDeclaration/"></a>[hasParamWithName](has-param-with-name.md)| <a name="io.github.kakaocup.kakao.intent/UriBuilder/hasParamWithName/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasParamWithName](has-param-with-name.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>fun [hasParamWithName](has-param-with-name.md)(name: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>More info  <br>Matches uri with given parameter name  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/UriBuilder/hasParamWithValue/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[hasParamWithValue](has-param-with-value.md)| <a name="io.github.kakaocup.kakao.intent/UriBuilder/hasParamWithValue/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasParamWithValue](has-param-with-value.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>fun [hasParamWithValue](has-param-with-value.md)(name: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, value: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>More info  <br>Matches uri with given parameter name and value  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/UriBuilder/hasPath/#kotlin.String/PointingToDeclaration/"></a>[hasPath](has-path.md)| <a name="io.github.kakaocup.kakao.intent/UriBuilder/hasPath/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasPath](has-path.md)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>fun [hasPath](has-path.md)(path: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>More info  <br>Matches uri with given path  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/UriBuilder/hasScheme/#kotlin.String/PointingToDeclaration/"></a>[hasScheme](has-scheme.md)| <a name="io.github.kakaocup.kakao.intent/UriBuilder/hasScheme/#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasScheme](has-scheme.md)(scheme: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>fun [hasScheme](has-scheme.md)(scheme: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>More info  <br>Matches uri with given scheme  <br><br><br>|
| <a name="io.github.kakaocup.kakao.intent/UriBuilder/hasSchemeSpecificPart/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[hasSchemeSpecificPart](has-scheme-specific-part.md)| <a name="io.github.kakaocup.kakao.intent/UriBuilder/hasSchemeSpecificPart/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [hasSchemeSpecificPart](has-scheme-specific-part.md)(scheme: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), part: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>fun [hasSchemeSpecificPart](has-scheme-specific-part.md)(scheme: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, part: Matcher<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br>More info  <br>Matches uri with given scheme and specific part  <br><br><br>|

