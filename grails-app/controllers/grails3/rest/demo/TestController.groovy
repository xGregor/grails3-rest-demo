package grails3.rest.demo

import grails.rest.RestfulController
import groovy.transform.CompileStatic

@CompileStatic
class TestController extends RestfulController {
    static responseFormats = ['json']

    static allowedMethods = [save: "POST", update: ["PUT", "POST"]]

    TestController() {
        super(Test)
    }
}
