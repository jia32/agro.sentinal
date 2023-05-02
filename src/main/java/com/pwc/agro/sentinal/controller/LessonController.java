//package com.pwc.agro.sentinal.controller;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.List;
//
//import com.pwc.agro.sentinal.model.NewLessonBO;
//import com.pwc.agro.sentinal.model.RESCODE;
//import com.pwc.agro.sentinal.utils.CheckParams;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiImplicitParams;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.FieldError;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import com.alibaba.fastjson.JSONObject;
//
//import javax.validation.constraints.NotNull;
//
//
///**
// * @author Jasmine
// * @createTime 2021年11月16日下午15:08:11
// */
//@Api(tags = "课程模块")
//@RestController
//@EnableAutoConfiguration
//@RequestMapping("/lesson")
//public class LessonController {
//    @Autowired
//    private LessonService lessonService;
//    @Autowired
//    private PracticeService practiceService;
//
//    @Value("${spring.datasource.url}")
//    private String mysqlurl;
//
//    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//    @Deprecated
//    @ApiOperation(value = "显示所有课程", httpMethod = "GET",
//            notes = "响应说明:")
//    @ApiImplicitParams({
//            @ApiImplicitParam(required = true, name = "page", value="页数"),
//            @ApiImplicitParam(required = true, name = "number", value="每页个数"),
//    })
//    @RequestMapping(value="/showAll",method=RequestMethod.GET)
//    public JSONObject showAll(@NotNull(message = "{required}") @RequestParam(name = "page", required = true)Integer page,
//                              @NotNull(message = "{required}") @RequestParam(name = "number", required = true)Integer number,
//                              @RequestHeader("token")String token){
//        JSONObject params = new JSONObject();
//        params.put("page", page);
//        params.put("number", number);
//        JSONObject result = CheckParams.checkParams(params);
//        if((Integer)result.get("code")==0) {
//            return lessonService.listLesson(page, number, token);
//        }else {
//            return RESCODE.PARAM_MISSING.getJSONRES(result.get("data"));
//        }
//    }
//
//    @ApiOperation(value = "添加课程", httpMethod = "POST",
//            notes = "响应说明:")
//    @RequestMapping(value ="/addLesson",method=RequestMethod.POST)
//    public JSONObject addLesson(@RequestBody @Validated NewLessonBO newLessonBO, BindingResult br,
//                                @RequestHeader("token")String token){
//        if(br.hasErrors()) {
//            StringBuilder sb = new StringBuilder();
//            sb.append(br.getObjectName()+":");
//            List<FieldError> errors  = br.getFieldErrors();
//            for (FieldError error : errors){
//                sb.append("["+error.getField() + ":"+error.getDefaultMessage()+"].");
//            }
//            return RESCODE.PARAM_ERROR.getJSONRES(sb.toString());
//        }
//        return lessonService.addLesson(newLessonBO,token);
//    }
//
//    @ApiOperation(value = "按照名称学科筛选课程", httpMethod = "GET",
//            notes = "响应说明:")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "name", value="课程名称（模糊查询）"),
//            @ApiImplicitParam(name = "subjects", value="学科（多选时用逗号分隔）"),
//
//    })
//    @RequestMapping(value ="/queryBySubjectOrName",method=RequestMethod.GET)
//    public JSONObject queryBySubjectOrName(@RequestParam(name = "name", required = false)String name,
//                                           @RequestParam(name = "subjects", required = false)String subjects,
//                                           @RequestHeader("token")String token) throws ParseException{
//        return lessonService.queryBySubjectOrName(name,subjects, token);
//    }
//
//    @ApiOperation(value = "更新课程", httpMethod = "POST",
//            notes = "响应说明:")
//    @RequestMapping(value="/updateLesson",method=RequestMethod.POST)
//    public JSONObject updateLesson(@RequestBody NewLessonBO newLessonBO){
//        return lessonService.updateLesson(newLessonBO);
//    }
//
//    @ApiOperation(value = "删除课程", httpMethod = "POST",
//            notes = "响应说明:")
//    @ApiImplicitParams({
//            @ApiImplicitParam(required = true, name = "lessonId", value="课程id"),
//    })
//    @RequestMapping(value="/delete",method=RequestMethod.POST)
//    public JSONObject delete( @NotNull(message = "{required}") @RequestParam(name = "lessonId", required = true)Long lessonId){
//        JSONObject params = new JSONObject();
//        params.put("lessonId", lessonId);
//        JSONObject result = CheckParams.checkParams(params);
//        if((Integer)result.get("code")==0) {
//            return lessonService.delete(lessonId);
//        }else {
//            return RESCODE.PARAM_MISSING.getJSONRES(result.get("data"));
//        }
//    }
//
//    @ApiOperation(value = "查看课程页详情", httpMethod = "GET",
//            notes = "响应说明:")
//    @ApiImplicitParams({
//            @ApiImplicitParam(required = true, name = "lessonId", value="课程id"),
//    })
//    @RequestMapping(value="/getLesson",method = RequestMethod.GET)
//    public JSONObject getLesson(@NotNull(message = "{required}") @RequestParam(name = "lessonId", required = true)long lessonId) {
//        JSONObject params = new JSONObject();
//        params.put("lessonId", lessonId);
//        JSONObject result = CheckParams.checkParams(params);
//        if((Integer)result.get("code")==0) {
//            return lessonService.getLesson(lessonId);
//        }else {
//            return RESCODE.PARAM_MISSING.getJSONRES(result.get("data"));
//        }
//    }
//
//    @ApiOperation(value = "根据学科查看课程", httpMethod = "GET",
//            notes = "响应说明:")
//    @ApiImplicitParams({
//            @ApiImplicitParam(required = true, name = "subjects", value="学科"),
//    })
//    @RequestMapping(value="/getLessonBySubjects",method = RequestMethod.GET)
//    public JSONObject getLessonBySubjects(@NotNull(message = "{required}") @RequestParam(name = "subjects", required = true)Integer subjects,
//                                          @RequestHeader("token")String token) {
//        JSONObject params = new JSONObject();
//        params.put("subjects", subjects);
//        JSONObject result = CheckParams.checkParams(params);
//        if((Integer)result.get("code")==0) {
//            return lessonService.queryBySubjects(subjects,token);
//        }else {
//            return RESCODE.PARAM_MISSING.getJSONRES(result.get("data"));
//        }
//    }
//
//    @ApiOperation(value = "复制课程", httpMethod = "GET",
//            notes = "响应说明:")
//    @ApiImplicitParams({
//            @ApiImplicitParam(required = true, name = "id", value="课程id"),
//            @ApiImplicitParam(required = true, name = "name", value="课程名称"),
//    })
//    @RequestMapping(value="/copyLesson",method = RequestMethod.GET)
//    public JSONObject copyLesson(@NotNull(message = "{required}") @RequestParam(name = "id", required = true)long id,
//                                 @NotNull(message = "{required}") @RequestParam(name = "name", required = true)String name,
//                                          @RequestHeader("token")String token) {
//        JSONObject params = new JSONObject();
//        params.put("id", id);
//        params.put("name", name);
//        JSONObject result = CheckParams.checkParams(params);
//        if((Integer)result.get("code")==0) {
//            return lessonService.copyLesson(id,name,token);
//        }else {
//            return RESCODE.PARAM_MISSING.getJSONRES(result.get("data"));
//        }
//    }
//
//
////    @ApiOperation(value = "根据A-Z索引显示所有课程", httpMethod = "GET",
////            notes = "响应说明:")
////    @RequestMapping(value="/sortAllLesson",method = RequestMethod.GET)
////    public JSONObject sortLesson() {
////            return lessonService.sortAllLesson();
////    }
//}
//
