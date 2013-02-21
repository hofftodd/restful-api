/* ****************************************************************************
Copyright 2013 Ellucian Company L.P. and its affiliates.
******************************************************************************/

package net.hedtech.restfulapi.extractors.json

import net.hedtech.restfulapi.extractors.JSONExtractor

class ThingDefaultDescriptionExtractor implements JSONExtractor {

    Map extract( Map json ) {
        if (!json.description) {
            json.put( 'description', "Default description" )
        }
        return json
    }

}