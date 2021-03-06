// This file was generated by Mendix Modeler 6.8.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package oauthmodule.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the OauthModule module

	/**
	* http://localhost:8089/callback/facebook
	*/
	public static String getCallbackURI_Facebook()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.CallbackURI_Facebook");
	}

	/**
	* http://localhost:8089/callback/google
	*/
	public static String getCallbackURI_Google()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.CallbackURI_Google");
	}

	/**
	* http://localhost:8089/callback/linkedin
	*/
	public static String getCallbackURI_Linkedin()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.CallbackURI_Linkedin");
	}

	public static boolean getCleanupOAuthLogAccessStateError()
	{
		return (Boolean)Core.getConfiguration().getConstantValue("OauthModule.CleanupOAuthLogAccessStateError");
	}

	public static boolean getCleanupOAuthLogXSSUnauthorized()
	{
		return (Boolean)Core.getConfiguration().getConstantValue("OauthModule.CleanupOAuthLogXSSUnauthorized");
	}

	public static String getClientId_Facebook()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.ClientId_Facebook");
	}

	public static String getClientId_Google()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.ClientId_Google");
	}

	/**
	* 77dpw3ypsjy1nv
	*/
	public static String getClientId_Linkedin()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.ClientId_Linkedin");
	}

	public static String getClientSecret_Facebook()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.ClientSecret_Facebook");
	}

	public static String getClientSecret_Google()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.ClientSecret_Google");
	}

	public static String getClientSecret_Linkedin()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.ClientSecret_Linkedin");
	}

	public static String getCookieErrorPage()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.CookieErrorPage");
	}

	public static String getCookieName()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.CookieName");
	}

	public static String getIndexPage()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.IndexPage");
	}

	/**
	* https://graph.facebook.com/oauth/access_token
	*/
	public static String getOAuthTokenURI_Facebook()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.OAuthTokenURI_Facebook");
	}

	/**
	* https://accounts.google.com/o/oauth2/token
	*/
	public static String getOAuthTokenURI_Google()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.OAuthTokenURI_Google");
	}

	/**
	* https://www.linkedin.com/uas/oauth2/accessToken?grant_type=authorization_code
	*/
	public static String getOAuthTokenURI_Linkedin()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.OAuthTokenURI_Linkedin");
	}

	/**
	* http://www.facebook.com/dialog/oauth
	*/
	public static String getOAuthURI_Facebook()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.OAuthURI_Facebook");
	}

	/**
	* https://accounts.google.com/o/oauth2/auth
	*/
	public static String getOAuthURI_Google()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.OAuthURI_Google");
	}

	/**
	* https://www.linkedin.com/uas/oauth2/authorization
	*/
	public static String getOAuthURI_Linkedin()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.OAuthURI_Linkedin");
	}

	public static String getStateErrorPage()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.StateErrorPage");
	}

	public static String getUnauthorizedAccessPage()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.UnauthorizedAccessPage");
	}

	/**
	* https://graph.facebook.com/me?access_token=
	*/
	public static String getUserInfoURI_Facebook()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.UserInfoURI_Facebook");
	}

	/**
	* https://www.googleapis.com/oauth2/v1/userinfo?access_token=
	*/
	public static String getUserInfoURI_Google()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.UserInfoURI_Google");
	}

	/**
	* https://api.linkedin.com/v1/people/~:(id,email-address,first-name,last-name,formatted-name,headline,location:(name),picture-url,public-profile-url)?oauth2_access_token=
	*/
	public static String getUserInfoURI_Linkedin()
	{
		return (String)Core.getConfiguration().getConstantValue("OauthModule.UserInfoURI_Linkedin");
	}
}