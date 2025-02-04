package dev.be.moduleapi.exception

import dev.be.modulecommon.enum.CodeEnum

class CustomException(
    val enum: CodeEnum
) : RuntimeException(enum.message) {
    val returnCode: String = enum.code
    val returnMessage: String = enum.message
}