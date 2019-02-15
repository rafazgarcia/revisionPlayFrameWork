// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/revisionPlayFrameWork/WDD1PlayLab/conf/routes
// @DATE:Fri Feb 15 10:16:44 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def pageone(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pageone")
    }
  
    // @LINE:11
    def onsale(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "onsale")
    }
  
    // @LINE:14
    def pagetwo(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pagetwo")
    }
  
    // @LINE:12
    def aboutus(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "aboutus")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }


}
