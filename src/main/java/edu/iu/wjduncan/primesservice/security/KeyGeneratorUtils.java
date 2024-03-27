package edu.iu.wjduncan.primesservice.security;
import com.nimbusds.jose.jwk.RSAKey;
import org.springframework.stereotype.Component;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

@Component
public class KeyGeneratorUtils {
    private KeyGeneratorUtils(){}

    static KeyPair generateRSAKey() {
        KeyPair keypair;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            keypair = keyPairGenerator.generateKeyPair();
        } catch (Exception ex) {
            throw new IllegalStateException();
        }
        return keypair;
    }
}
