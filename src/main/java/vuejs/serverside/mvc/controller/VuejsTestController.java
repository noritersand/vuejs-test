package vuejs.serverside.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class VuejsTestController {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(VuejsTestController.class);

	private VuejsTestController() {}

//	@GetMapping("/vuejs/simpledemo.do")
//	public ModelAndView drawSimpleDemo(ModelAndView mv) {
//		mv.setViewName("/vuejs/simple-demo");
//		return mv;
//	}
}
