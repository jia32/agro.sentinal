package com.pwc.agro.sentinal.utils;

/**
 * @ClassName Constants
 * @Author Jasmine
 * @Date 2021年11月11日上午10:44:24
 */
public class Constants {
	public static final String RESPONSE_CODE_KEY = "code"; //返回对象里的code的key名称
	public static final String RESPONSE_MSG_KEY = "msg"; //返回对象里的msg的key名称
	public static final String RESPONSE_DATA_KEY = "data"; //返回对象里的data的key名称
	public static final String RESPONSE_SIZE_KEY = "pageSize"; //返回对象里的size的key名称
	public static final String RESPONSE_REAL_SIZE_KEY = "realSize";

	public static final Integer FILE_TYPE_ARC = 1;
	public static final Integer FILE_TYPE_MP4 = 2;
	public static final Integer FILE_TYPE_PNG = 3;
	public static final Integer FILE_TYPE_PPT = 4;
	public static final Integer FILE_TYPE_QA = 5;
	public static final Integer FILE_TYPE_IMG = 6;
	public static final Integer FILE_TYPE_MP3 = 7;
	public static final Integer FILE_TYPE_OTHER = 99;

	public static final Integer RES_TYPE_ARC = 1;
	public static final Integer RES_TYPE_MP4 = 2;
	public static final Integer RES_TYPE_THUMBNAIL = 3;
	public static final Integer RES_TYPE_PPT = 4;//前端使用mediatype的时候，4指代PPT中的图片
	public static final Integer RES_TYPE_QA = 5;
	public static final Integer RES_TYPE_QA_IMAGE = 6;
	public static final Integer RES_TYPE_PPT_IMAGE= 7;
	public static final Integer RES_TYPE_IMG = 8;
	public static final Integer RES_TYPE_MP3 = 9;
	public static final Integer RES_TYPE_P_IMAGE= 10;


	public static final Integer RES_TYPE_OTHER = 99;

	public static final Integer MESSAGE_FROM_ROBOT = 1;
	public static final Integer MESSAGE_FROM_VUE = 2;
	public static final Integer MESSAGE_FROM_NOT_RELEVANT = 99;

	public static final Integer SMS_JUST_SENDCODE=0;
	public static final Integer SMS_FOR_REGISTER=1;
	public static final Integer SMS_FOR_RESET_PASSWORD=2;
	public static final Integer SMS_FOR_REGIST_SUCCESS=3;

	public static final String AWS_SERVER = "aws";
	public static final String K8S_SERVER = "ali";

	public final static String MSGCODE_COUNT = "msgcode:count:";
	public final static String MSGCODE = "msgcode:";
	public final static String EMAILCODE = "emailcode:";
	public final static String TOKEN = "user:token:";
	public final static String ORDERCODE="ordercode:";

	public final static byte USER_IN_USE = 0;
	public final static byte USER_DELETED = 1;

	public final static byte INVALID_USER = 0;
	public final static byte VALID_USER = 1;

	public final static byte CODE_FOR_MANAGER = 0;
	public final static byte CODE_FOR_EDITOR_AND_TEACHER = 1;

	public final static byte NOT_ALLOW_EDITOR = 0;
	public final static byte ALLOW_EDITOR = 1;

	public final static String EMAIL_FOR_RESET_PASSWORD="iPal Classroom Verification Code for Password Change";
	public final static String EMAIL_FOR_REGISTRATION="iPal Classroom Verification Code for Registration";
	public final static String EMAIL_JUST_SENDCODE = "iPal Classroom Verification Code";
	public final static String EMAIL_FOR_REGIST_SUCCESS="iPal Classroom Registration Success";

	public final static String ROBOTCODE_ROBOT_ONLINE="100";
	public final static String ROBOTCODE_ROBOT_OFFLINE="101";
	public final static String ROBOTCODE_DOWNLOAD_STATUS="105";
	public final static String SERVERCODE_FOR_R_IF_ROBOT_READY="110";
	public final static String ROBOTCODE_ROBOT_IS_READY="111";
	public final static String ROBOTCODE_ROBOT_IS_BUSY="112";
	public final static String SERVERCODE_FOR_R_LESSON_READY="120";
	public final static String SERVERCODE_FOR_R_UPLOAD_SCRIPT="130";
	public final static String ROBOTCODE_FILEPATH_RECEIVED="131";
	public final static String ROBOTCODE_DOWNLOAD_START="140";

	public final static String VUECODE_VUE_ONLINE="200";
	public final static String VUECODE_VUE_OFFLINE="201";
	public final static String SERVERCODE_ROBOTS_READY="210";
	public final static String SERVERCODE_ROBOTS_NOT_READY="211";
	public final static String VUECODE_ROBOTS_NO_RESPONSE="212";
	public final static String SERVERCODE_FOR_V_LESSON_READY="220";
	public final static String SERVERCODE_FOR_V_LESSON_NOT_READY="221";
	public final static String VUECODE_LESSON_READY_NO_RESPONSE="222";
	public final static String SERVERCODE_FOR_V_UPLOAD_SUCCESS="230";
	public final static String SERVERCODE_FOR_V_UPLOAD_FAILED="231";
	public final static String VUECODE_UPLOAD_NO_RESPONSE="232";

	public final static String SERVERCODE_FOR_V_DOWNLOAD_START="240";
	public final static String SERVERCODE_FOR_V_DOWNLOAD_NOT_START="241";
	public final static String VUECODE_DOWNLOAD_NO_RESPONSE="242";
}