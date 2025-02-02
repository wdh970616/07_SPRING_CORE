package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*
 * @Qualifier
 * - 여러개의 bean 객체중에서 특정 bean 객체를 이름으로 지정하는 어노테이션이다.
 * - @Primary 어노테이션과 @Qualifier 어노테이션이 함께 쓰였을 때, @Qualifier가 우선시된다.
 */
@Service("pokemonServiceQualifier")
public class PokemonService {

    // 1. 필드 주입방식
//    @Qualifier("pikachu")
//    @Autowired
//    private Pokemon pokemon;

    private Pokemon pokemon;

    @Autowired
    public PokemonService(@Qualifier("pikachu") Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
