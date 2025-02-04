package dev.be.moduleapi.exceptionhandler

import dev.be.moduleapi.exception.CustomException
import dev.be.moduleapi.response.CommonResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(CustomException::class)
    fun handlerCustomException (
        e: CustomException
    ): CommonResponse<String> {
        return CommonResponse (
            returnCode = e.returnCode,
            returnMessage = e.returnMessage
        )
    }

    @ExceptionHandler(Exception::class)
    fun handlerException (
        e: CustomException
    ): CommonResponse<String> {
        return CommonResponse (
            returnCode = e.returnCode,
            returnMessage = e.returnMessage
        )
    }
}