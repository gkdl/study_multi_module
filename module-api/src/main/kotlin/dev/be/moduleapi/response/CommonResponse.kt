package dev.be.moduleapi.response

import com.fasterxml.jackson.annotation.JsonInclude
import dev.be.modulecommon.enum.CodeEnum

//null인 값은 응답객체에 보여주지 않는다
@JsonInclude(JsonInclude.Include.NON_NULL)
data class CommonResponse<T> (
    private var returnCode: String,
    private var returnMessage: String,
    private var info: T? = null
) {
    constructor(codeEnum: CodeEnum) : this(
        returnCode = codeEnum.code,
        returnMessage = codeEnum.message
    )

    // info만 전달하는 생성자 (성공 기본 응답)
    constructor(info: T) : this(
        returnCode = CodeEnum.SUCCESS.code,
        returnMessage = CodeEnum.SUCCESS.message,
        info = info
    )

    // CodeEnum과 info를 함께 전달하는 생성자
    constructor(codeEnum: CodeEnum, info: T) : this(
        returnCode = codeEnum.code,
        returnMessage = codeEnum.message,
        info = info
    )
}
