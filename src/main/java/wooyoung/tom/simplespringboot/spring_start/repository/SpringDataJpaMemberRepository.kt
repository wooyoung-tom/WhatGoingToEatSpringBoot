package wooyoung.tom.simplespringboot.spring_start.repository

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface SpringDataJpaMemberRepository: JpaRepository<Member, Long>, MemberRepository {

    override fun findByName(name: String): Optional<Member>
}