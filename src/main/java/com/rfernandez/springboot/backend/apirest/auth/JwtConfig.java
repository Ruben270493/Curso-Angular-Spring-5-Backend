package com.rfernandez.springboot.backend.apirest.auth;

public class JwtConfig {
	
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.123456789";
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEAquviD2jml8di/29rKA2BGFuNzMyGcBqwWtrUa29KoR1d5jah\r\n" + 
			"6X01qc2kAJPAnUJlD/WTKoR/ItCzBKMeo3HVbtMrSSqSB/1Ij26O425gHDRR6Uky\r\n" + 
			"wxO3f40JqvH3whMNrOFLCLDmjc8cCELIVHkVBQWrzyNgkYVWnq9pr9iQBMC6EubB\r\n" + 
			"13stUTUOlpTMTCneXqoX9Th0iq0XxCyCPJ3seDMQ1GMUzC7Lr0fte2HObmtgQtko\r\n" + 
			"HcVNmnUbZ1OBezRpPxssM83gjcbDkcBHmVfWWKGIbo3oyEnihyzSGKizPbOnFXBc\r\n" + 
			"IdAW31jBGD2zOf7l1hIgN/dJd2uxAZ79b54p0wIDAQABAoIBAQCQbeDJargoG0kR\r\n" + 
			"VcIzxy2GOp8ZJt6XTkYlj/Kdkh57BIi7JwEsfyxgfy+NeUzy1g72LGqeK/YOolIT\r\n" + 
			"og8ax+81xeU2320kqSeuZBsEHdnDG4b33W2yoC+X7cL0m6DjcxxEMOApyOoZfKBQ\r\n" + 
			"brY/g016v+8NivRoI0ctskZZXGNeT2bkv4B9qCwUROhMcRyL/PMgld5jzUkkCCnW\r\n" + 
			"cWK3reU2rk5yI/a74KWhN3gOrosNvh2jrNfxWpgE3h6M0UOpZuszlU0JtrF2LpKI\r\n" + 
			"q+OXK9SKEfA3E8hbNCC1uoad5Nb38wUnVKK4w+iv72PztIan9VeEVJSugTHKEkoW\r\n" + 
			"OhYVqtK5AoGBAN9fq9ifZEG0yxGS9YyVN7/IqkTqVl1LYtib1GLdVJWIrNRERmyX\r\n" + 
			"IVxGPfbveGCpGGpcleHBdSs1RoI2zOcc+b4Xbf3c85pIzUPoaAagKokuC74/FgJ3\r\n" + 
			"dWUZkt5pu4zv/LSfKjZtz4Q3HJLjuT5XznyB+yNE6y0wsd9wLMHfZrONAoGBAMPi\r\n" + 
			"7goHvNzAamR7cxafgaYcjCC26KtOUSYkM4YiY5G5b7zDD7RxuTnVfc1D5GQrC6wZ\r\n" + 
			"YzSeJ/muWp0dUJNNMR6zkhbUBJJA0GPxVinDNbA2a+9Dkowno7574mgGdtK/2VNa\r\n" + 
			"G+Lq0d9TQXu1b/sjXBy2qLMqjqF6VnxKfeKRhUrfAoGAQUKHR1uSA+xZI8JGwRLb\r\n" + 
			"Xcm3jTjVkJ40u8oTK+s0ChgLPlzQImupEHdpJRrjlYHxoyl3lKRbogsHlYWDKcZ6\r\n" + 
			"ZIId3XxPI3U/myZsNftXUgrE3Yk62e+iua3WDergI5X9w5t4zrwYU61ySKwFc+Rd\r\n" + 
			"bFzhTXWWK/a9EOWJ/f5R2AUCgYEArOO2uw2XSLNfc+5tZrNDp8wcdadadg/6mZJs\r\n" + 
			"E2B4xx6HG3CChP22wO/ISAo7I5nGhJAnukI5ACs9+NvtyQThbLqLHzDkE/22r+9K\r\n" + 
			"4DNWSH/QBe57As7du/r1mmDSMTJ46xNl94LP169Q5ZH/EwZjf0hMX04ZczZZ7PuG\r\n" + 
			"XhmYLrsCgYBDD87bgPhV1tHS5sVMA09ZdVCjHld8dsb4ZPxHOl8Fnu80+UDNoI/u\r\n" + 
			"M30JI9U2my/Kob9pShHkigIbcHE2ERA+yN7C1HAB/mEp6nFrSdeeb66aHm0ZQsCQ\r\n" + 
			"Ai6SAL1IzibR4T4iz8AFlA+KoyCPImPOixDGfHZMzJhCbDmSfRhm3Q==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAquviD2jml8di/29rKA2B\r\n" + 
			"GFuNzMyGcBqwWtrUa29KoR1d5jah6X01qc2kAJPAnUJlD/WTKoR/ItCzBKMeo3HV\r\n" + 
			"btMrSSqSB/1Ij26O425gHDRR6UkywxO3f40JqvH3whMNrOFLCLDmjc8cCELIVHkV\r\n" + 
			"BQWrzyNgkYVWnq9pr9iQBMC6EubB13stUTUOlpTMTCneXqoX9Th0iq0XxCyCPJ3s\r\n" + 
			"eDMQ1GMUzC7Lr0fte2HObmtgQtkoHcVNmnUbZ1OBezRpPxssM83gjcbDkcBHmVfW\r\n" + 
			"WKGIbo3oyEnihyzSGKizPbOnFXBcIdAW31jBGD2zOf7l1hIgN/dJd2uxAZ79b54p\r\n" + 
			"0wIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";

}
