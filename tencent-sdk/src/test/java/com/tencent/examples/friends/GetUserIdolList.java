package com.tencent.examples.friends;

import cc.pp.service.tencent.model.UserIdolListData;

import com.tencent.weibo.api.FriendsAPI;
import com.tencent.weibo.constants.OauthInit;
import com.tencent.weibo.oauthv1.OAuthV1;

public class GetUserIdolList {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		OAuthV1 oauth = new OAuthV1();
		String[] tokens = { "2c656d405a1d4587b7b99d143102d002", "b36e96d43ed75485258f0fdf0cefe143" };
		OauthInit.oauthInit(oauth, tokens[0], tokens[1]);
		FriendsAPI fa = new FriendsAPI(oauth.getOauthVersion());
		String uid = "cxpolice";
		UserIdolListData friendsinfo = fa.userIdollist(oauth, "json", "30", "0", uid, "", "0", "0");
		System.out.println(friendsinfo);

	}

}
