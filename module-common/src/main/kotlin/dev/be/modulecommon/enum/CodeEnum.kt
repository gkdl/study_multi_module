package dev.be.modulecommon.enum

enum class CodeEnum(
    val code: String,
    val message: String
) {
    SUCCESS("0000", "SUCCESS"),
    UNKNOWN_ERROR("9999", "UNKNOWN_ERROR");

}