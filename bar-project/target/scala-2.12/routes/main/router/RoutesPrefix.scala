
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mingina/Workspace/bars/bar-project/conf/routes
// @DATE:Tue Sep 05 23:45:37 EAT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
