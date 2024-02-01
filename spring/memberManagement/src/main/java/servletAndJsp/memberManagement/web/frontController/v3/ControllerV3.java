package servletAndJsp.memberManagement.web.frontController.v3;

import servletAndJsp.memberManagement.web.frontController.ModelView;

import java.util.Map;

public interface ControllerV3 {

    // Replace process(HttpServletRequest request, HttpServletResponse response)
    ModelView process(Map<String, String> paramMap);
}
