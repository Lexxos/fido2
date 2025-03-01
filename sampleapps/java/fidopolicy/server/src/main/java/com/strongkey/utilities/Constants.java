/**
* Copyright StrongAuth, Inc. All Rights Reserved.
*
* Use of this source code is governed by the GNU Lesser General Public License v2.1
* The license can be found at https://github.com/StrongKey/fido2/blob/master/LICENSE
*/

package com.strongkey.utilities;

// Constants
public class Constants {
    // Webauthn tutorial (Relying Party (RP)) Path names
    public static final String RP_REGISTER_EMAIL_PATH = "registerEmail";
    public static final String RP_PREGISTER_PATH = "preregister";
    public static final String RP_PREGISTER_EXISTING_PATH = "preregisterExisting";
    public static final String RP_REGISTER_PATH = "register";
    public static final String RP_REGISTER_EXISTING_PATH = "registerExisting";
    public static final String RP_PREAUTHENTICATE_PATH = "preauthenticate";
    public static final String RP_AUTHENTICATE_PATH = "authenticate";
    public static final String RP_ISLOGGEDIN_PATH = "isLoggedIn";
    public static final String RP_LOGOUT_PATH = "logout";
    public static final String RP_PATH_DELETEACCOUNT = "deleteAccount";
    public static final String RP_PATH_GETUSERINFO = "getuserinfo";
    public static final String RP_PATH_REMOVEKEYS = "removeKeys";

    // V3 API endpoints
    public static final String REST_SUFFIX = "/skfs/rest";
    public static final String PREREGISTER_ENDPOINT = "/preregister";
    public static final String REGISTER_ENDPOINT = "/register";
    public static final String PREAUTHENTICATE_ENDPOINT = "/preauthenticate";
    public static final String AUTHENTICATE_ENDPOINT = "/authenticate";
    public static final String GETKEYSINFO_ENDPOINT = "/getkeysinfo";
    public static final String UPDATE_ENDPOINT = "/updatekeyinfo";
    public static final String DEREGISTER_ENDPOINT = "/deregister";

    public static final String SKFS_WSDL_SUFFIX = "/skfs/soap?wsdl";

    // SKFS REST API names
    public static final String SKFS_PATH_DOMAINS = "domains";
    public static final String SKFS_PATH_FIDOKEYS = "fidokeys";
    public static final String SKFS_PATH_CHALLENGE = "challenge";
    public static final String SKFS_PATH_REGISTRATION = "registration";
    public static final String SKFS_PATH_AUTHENTICATION = "authentication";

    // Session Information
    public static final String SESSION_USERNAME = "username";
    public static final String SESSION_POLICY = "policy";
    public static final String SESSION_ISAUTHENTICATED = "isAuthenticated";

    // Policies
    public static final String MINIMAL_POLICY = "minimal";
    public static final String MODERATE_POLICY = "moderate";
    public static final String STRICT_POLICY = "strict";
    public static final String STRICT_ANDROID_SAFETYNET_POLICY = "strictAndroidSafetyNet";
    public static final String RESTRICTED_ANDROID_KEY_POLICY = "restrictedAndroidKey";
    public static final String RESTRICTED_TPM_POLICY = "restrictedTpm";
    public static final String RESTRICTED_APPLE_POLICY = "restrictedApple";
    public static final String RESTRICTED_FIPS_POLICY = "restrictedFips";

    // Frontend <-> Webauthn tutorial (Relaying Party (RP)) JSON mappings
    public static final String RP_JSON_KEY_USERNAME = "username";
    public static final String RP_JSON_KEY_DISPLAYNAME = "displayName";
    public static final String RP_JSON_KEY_POLICY = "policy";
    public static final String RP_JSON_KEY_KEYS = "keys";
    public static final String RP_JSON_KEY_USERINFO = "userInfo";
    public static final String RP_JSON_KEY_KEYIDS = "keyIds";
    public static final String RP_JSON_KEY_RESPONSE = "Response";
    public static final String RP_JSON_KEY_MESSAGE = "Message";
    public static final String RP_JSON_KEY_ERROR = "Error";
    public static final String RP_JSON_KEY_JWT = "jwt";

    public static final String RP_JSON_VALUE_TRUE_STRING = "True";
    public static final String RP_JSON_VALUE_FALSE_STRING = "False";

    //Webauthn tutorial <-> SKFS Query Parameters
    public static final String SKFS_QUERY_KEY_USERNAME = "username";

    // Webauthn tutorial <-> SKFS JSON mappings
    public static final String SKFS_JSON_KEY_PROTOCOL = "protocol";

    public static final String SKFS_JSON_KEY_USERNAME = "username";
    public static final String SKFS_JSON_KEY_DISPLAYNAME = "displayname";
    public static final String SKFS_JSON_KEY_POLICY = "policy";
    public static final String SKFS_JSON_KEY_RESPONSE = "response";

    public static final String SKFS_JSON_KEY_OPTIONS = "options";
    public static final String SKFS_JSON_KEY_OPTIONS_AUTHSELECTION = "authenticatorSelection";
    public static final String SKFS_JSON_KEY_OPTIONS_ATTACHMENT = "authenticatorAttachment";
    public static final String SKFS_JSON_KEY_OPTIONS_RESIDENTKEY = "requireResidentKey";
    public static final String SKFS_JSON_KEY_OPTIONS_USERVERIFICATION = "userVerification";
    public static final String SKFS_JSON_KEY_OPTIONS_ATTESTATION = "attestation";
     public static final String SKFS_JSON_KEY_OPTIONS_REQUIRED = "required";
    public static final String SKFS_JSON_KEY_OPTIONS_PREFERRED = "preferred";

    public static final String SKFS_JSON_KEY_METADATA = "metadata";
    public static final String SKFS_JSON_KEY_VERSION = "version";
    public static final String SKFS_JSON_KEY_CREATELOC = "create_location";
    public static final String SKFS_JSON_KEY_USEDLOC = "last_used_location";
    public static final String SKFS_JSON_KEY_ORIGIN = "origin";

    public static final String SKFS_JSON_KEY_REQUEST = "request";
    public static final String SKFS_JSON_KEY_KEYID = "randomid";

    public static final String SKFS_RESPONSE_JSON_KEY_RESPONSE = "Response";
    public static final String SKFS_RESPONSE_JSON_KEY_CHALLENGE = "Challenge";
    public static final String SKFS_RESPONSE_JSON_KEY_MESSAGE = "Message";
    public static final String SKFS_RESPONSE_JSON_KEY_ERROR = "Error";
    public static final String SKFS_RESPONSE_JSON_KEY_KEYS = "keys";
    public static final String SKFS_RESPONSE_JSON_KEY_RANDOMID = "keyid";

    //  Miscellaneous
    public static final String CREATE_LOCATION = "N/A";
    public static final String LAST_USED_LOCATION = "N/A";
    public static final int SESSION_TIMEOUT_VALUE = 600;
    public static final int SKFS_TIMEOUT_VALUE = 30000;
    public static final String API_VERSION = "SK3_0";
    public static final String PROTOCOL_REST = "REST";
    public static final String PROTOCOL_SOAP = "SOAP";
    public static final String AUTHORIZATION_HMAC = "HMAC";
    public static final String AUTHORIZATION_PASSWORD = "PASSWORD";
    public static final String JSON_EMPTY = "{}";
}
