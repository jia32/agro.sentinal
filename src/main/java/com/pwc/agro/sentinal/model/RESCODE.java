package com.pwc.agro.sentinal.model;

import com.alibaba.fastjson.JSONObject;
import com.pwc.agro.sentinal.utils.Constants;

/**
 * @author Jasmine
 * @createTime 2021年11月16日上午9:50:04
 */

public enum RESCODE {
    SUCCESS(0, "success"),
    FAILURE(1,"failure"),

    ID_NOT_EXIST(2,"id does not exist"),
    USER_ID_NOT_EXIST(2,"user does not exist"),
    NAME_NOT_EXIST(2,"user name does not exist"),
    EMAIL_NOT_EXIST(2,"user name does not exist"),
    LESSON_ID_NOT_EXIST(2,"lesson id does not exist"),
    QA_ID_NOT_EXIST(2,"问答id不存在"),
    PRACTICE_ID_NOT_EXIST(2,"practice id does not exist"),
    SCRIPT_ID_NOT_EXIST(2,"script id does not exist"),

    USER_IS_NOT_VALID(3,"user is not valid"),
    NULL_FILE(3,"null file"),
    TYPE_INVALID(3,"invalid file type"),
    FILE_NOT_FOUND(3,"invalid file index"),
    MQTT_DISCONNECTED(3,"MQTT disconnected"),
    NO_CHANGES(3,"No changes"),
    INVALID_ROBOT_SN(3,"invalid robot sn"),
    PARAM_MISSING(3,"lack of parameter"),
    NO_LESSON_FOUND(3,"no lesson found"),
    NO_IMAGE_FOUND(3,"cannot find image"),
    RES_NOT_VALID(3,"resource does not exist"),
    INVALID_TOKEN(3,"invalid token"),
    INVALID_ACTIVECODE(3,"You active code is invalid, please input the correct one, or contact your administrator!"),
    INVALID_MSGCODE(3,"invalid code"),

    PRACTICE_UPDATE_ERROR(3,"practice update error"),
    SCRIPT_UPDATE_ERROR(3,"script update error"),
    FILE_UPLOAD_ERROR(3, "file upload error"),
    SEND_SMS_ERROR(3,"sms did not send"),
    SEND_EMAIL_ERROR(3,"email did not send"),
    SEND_MSGCODE_COUNT_ERROR(3, "send msgcode over three times"),
    PPT_CONVERSION_FAIL(3,"fail to convert ppt to image"),
    IMG_THUMBNAIL_FAIL(3,"fail to generate thumbnail for image"),

    USER_ALREADY_OUT(4,"user already out"),
    ROBOT_SN_EXIST(4,"robot sn exists"),
    NAME_EXIST(4,"user name exists"),
    EMAIL_EXIST(4,"email exists"),
    PHONE_EXIST(4,"invalid phone num"),

    LESSON_NAME_ALREADY_USED(4,"lesson name already used"),
    QA_NAME_ALREADY_USED(4,"该问答名称已存在"),
    FILENAME_ALREADY_USED(4,"filename already used"),
    SCRIPT_ALREADY_SYNED(4,"script already syned"),
    USED_BY_LESSON(4, "referenced by lesson"),
    PARAM_ERROR(400,"error parameter"),
    PARAM_NULL(500,"parameter is null"),
    TOKEN_ERROR(503,"invalid token"),
    WRONG_MSGCODE(5,"wrong code"),
    WRONG_PWD(5,"wrong pwd");

    private int code;
    private String msg;


    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    RESCODE(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    /**
     * 最新的返回json
     */
    public JSONObject getJSONRES(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(Constants.RESPONSE_CODE_KEY, this.code);
        jsonObject.put(Constants.RESPONSE_MSG_KEY, this.msg);
        return jsonObject;
    }

    public JSONObject getJSONRES(String msg){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(Constants.RESPONSE_CODE_KEY, this.code);
        jsonObject.put(Constants.RESPONSE_MSG_KEY, msg);
        return jsonObject;
    }

    public JSONObject getJSONRES(Object entity){
        JSONObject jsonres = getJSONRES();
        jsonres.put(Constants.RESPONSE_DATA_KEY, entity);
        return jsonres;
    }

    public JSONObject getJSONRES(Object entity,int pages,int count){
        JSONObject jsonres = getJSONRES();
        jsonres.put(Constants.RESPONSE_DATA_KEY, entity);
        jsonres.put(Constants.RESPONSE_SIZE_KEY, pages);
        jsonres.put(Constants.RESPONSE_REAL_SIZE_KEY, count);
        return jsonres;
    }
}

