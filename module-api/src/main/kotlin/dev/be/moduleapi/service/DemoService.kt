package dev.be.moduleapi.service

import dev.be.moduleapi.exception.CustomException
import dev.be.modulecommon.domain.Member
import dev.be.modulecommon.enum.CodeEnum
import dev.be.modulecommon.repositories.MemberRepository
import dev.be.modulecommon.service.CommonDemoService
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class DemoService(
    @Value("\${profile-name}") private val name: String,
    private val memberRepository: MemberRepository,
) {
    fun save() : String {
        System.out.println("name : " + name)

        memberRepository.save(
            Member(
                null,
                name = Thread.currentThread().name
            )
        )
        return "save";
    }

    fun find() : String {
        val size = memberRepository.findAll().size
        System.out.println("DB size : " + size)
        return "find";
    }
    fun exception() : String {
        if(true) {
            throw CustomException(CodeEnum.UNKNOWN_ERROR);
        }

        return "exception";
    }
}