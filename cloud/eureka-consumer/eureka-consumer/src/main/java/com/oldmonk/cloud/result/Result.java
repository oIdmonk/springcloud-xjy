
package com.oldmonk.cloud.result;


/**
 * 响应信息枚举类
 *
 * @author xujingyang
 * @date 2018/05/28
 */
public enum Result {
    /*==============================参数错误================================*/
    PARANERROE("001", "参数错误"),
    ORGIDNULL("001", "组织ID不能为空"),
    MOBILEERROR("001", "手机号格式错误"),
    TITLENULL("001", "消息标题不能为空"),
    TITLELEN("001", "消息标题长度不能超过100个字符"),
    EMAILERROR("001", "邮箱格式存在错误"),
    USERIDLEN("001", "用户Id长度不能超过32位"),
    WECHATPARAMERROR("001", "微信推送参数(wechatAgentId,wechatCorpId,wechatCorpSecret)不能为空"),
    WECHAIDNULL("001", "微信Id不能为空"),
    LEDIDNULL("001", "ledId不能为空"),
    LEDSIDNULL("001", "leds不能为空"),
    USERIDNULL("001", "userId不能为空"),
    FROMUSERIDNULL("001", "来源用户Id不能为空"),
    MSGIDNULL("001", "messageId不能为空"),
    CHANNELNAMEERROR("001", "通道名称填写错误"),
    CHANNELNAMEERROR2("001", "转发通道必须在推送权限列表里"),
    CHANNELSINGLEERROR("001", "只能传单个通道"),
    TOOBJSERROR("001", "推送对象不能为空"),
    TEMPLATEISNOTJSON("001", "短信模板参数必须为合法json字符串"),
    TEMPLATEIDISNULL("001", "短信模板Id不能为空"),
    TEMPLATEPARAMISNULL("001", "短信模板参数json的key必须与模板${xxx}保持一致"),
    ISNOTSMSTYPE("001", "短信推送服务类型不存在!"),
    ISNOTZSSMSTYPE("001", "短信类型必须为整数!"),
    ISNOTNULLSMSTYPE("001", "短信类型不能为空!"),
    CLICK2URLNULL("001", "点击跳转链接不能为空!"),
    PICURLNULL("001", "图片链接不能为空!"),
    POPSTYLENULL("001", "弹窗类型不能为空!"),
    POPNUMCHECK("001", "弹窗弹出次数必须为1-100的整数!"),


    /*==============================业务层错误================================*/
    SERVICEERROR("800", "业务异常"),
    SMSCHECKFUILER("801", "短信频率错误"),
    SMSPACKAGEABSENCE("806", "组织内的短信套餐已用完，无法发送短信，请及时充值"),
    SMSPACKAGENOOPEN("807", "组织未购买短信套餐，无法发送短信"),
    ORGNOOPEN("808", "您的组织已停用或已过期，请联系管理员"),
    SMSPACKAGENULL("809", "组织短信包余量信息未获取到，无法推送"),
    SMSPACKAGEAERROE("810", "组织短信包余量信息获取失败，无法推送"),
    ALREADYEXSIST("812", "clientId已经存在"),


    /*==============================全局错误================================*/
    SUCCESS("200", "操作成功"),
    FAILED("201", "操作失败"),
    ERROR("500", "服务器端错误"),
    NOINTERFACEEXCEPTIONMSG("504", "接口不存在!"),
    CHAOSHI("506", "远程服务挂啦!"),
    POWER_UNAUTHORIZED("505", "token无效"),


    /*==============================其他错误================================*/
    ENDBERRORCODE("300", "消息入库异常"),
    ENMQERRORCODE("301", "消息入队异常"),
    NOPERMISSION("302", "无推送权限"),
    ALREADYCONSUME("303", "此条消息已经消费过"),
    PUSHSERVERERROR("304", "第三方推送服务异常"),
    CHANGECHANNELERROR("305", "切换通道异常"),
    MESSAGENULL("306", "处理消息为空，请先添加消息"),
    MQKEYNULL("307", "队列交换机key不能为空，请先添加key"),
    OVERTIME("308", "1小时过去了，仍超频，判为推送失败"),
    WECHATPARAMSERROR("309", "微信参数错误"),
    OVERCLOCK("45009", "微信API调用超频");

    private Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}

