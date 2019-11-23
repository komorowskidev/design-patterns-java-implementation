package pl.komorowskidev.designpatternsjavaimplementation.structural.proxy

import spock.lang.Specification

class VideoRentalProxyTest extends Specification{

    private VideoRentalProxy videoRentalProxy

    private VideoRental videoRentalMock

    private User userMock

    def setup(){
        videoRentalMock = Mock(Notflox)
        userMock = Mock(User)
        videoRentalProxy = new VideoRentalProxy(videoRentalMock, userMock)
    }

    def "should allow watching movie when user is older then ageRestriction"(){
        given:
        videoRentalMock.getAgeRestrictions(_ as String) >> 3
        userMock.getAge() >> 4
        when:
        videoRentalProxy.getMovie("any title")
        then:
        notThrown(AgeException)
    }

    def "should allow watching movie when user age is equal to ageRestriction"(){
        given:
        videoRentalMock.getAgeRestrictions(_ as String) >> 3
        userMock.getAge() >> 3
        when:
        videoRentalProxy.getMovie("any title")
        then:
        notThrown(AgeException)
    }

    def "should throw AgeException when user is younger then ageRestriction"(){
        given:
        videoRentalMock.getAgeRestrictions(_ as String) >> 3
        userMock.getAge() >> 2
        when:
        videoRentalProxy.getMovie("any title")
        then:
        thrown(AgeException)
    }
}
