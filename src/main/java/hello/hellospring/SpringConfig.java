package hello.hellospring;

import hello.hellospring.repository.JpaMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 자바코드로 스프링 빈 생성
@Configuration
public class SpringConfig {
    /**
    // controller는 어쩔 수 없이 컴포넌트 스캔 후 AutoWired로 해야 함
    private EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }**/
    private final MemberRepository memberRepository;
    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }
    //@Bean
    //public MemberRepository memberRepository(){
    //    return new JpaMemberRepository(em);
    //}
}
