package com.github.jvalentino.delta

import com.github.jvalentino.delta.DeltaApp
import org.springframework.boot.SpringApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import spock.lang.Specification

class DeltaAppTest extends Specification {

    def setup() {
        GroovyMock(SpringApplication, global:true)
    }

    def "test main"() {
        when:
        DeltaApp.main(null)

        then:
        1 * SpringApplication.run(DeltaApp, null)
    }

    def "Test configure"() {
        given:
        DeltaApp subject = new DeltaApp()
        SpringApplicationBuilder builder = GroovyMock()

        when:
        subject.configure(builder)

        then:
        1 *  builder.sources(DeltaApp)
    }
}
