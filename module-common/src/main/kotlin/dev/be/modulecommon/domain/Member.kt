package dev.be.modulecommon.domain

import jakarta.persistence.*

@Entity
data class Member (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,

    @Column
    val name: String,
)