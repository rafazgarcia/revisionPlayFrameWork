// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/revisionPlayFrameWork/WDD1PlayLab/conf/routes
// @DATE:Fri Feb 15 10:16:44 GMT 2019


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
