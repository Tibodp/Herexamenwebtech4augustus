package edu.ap.eightball.redis;

import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    private StringRedisTemplate template;

    @Autowired
    public void setRedisTemplate(StringRedisTemplate template) {
        this.template = template;
    }

    public void setKey(String key, String value) {
        ValueOperations<String, String> ops = this.template.opsForValue();
        if (!this.template.hasKey(key)) {
            ops.set(key, value);
        }
    }

    public void deleteKey(String key) {
        this.template.delete(key);
    }

    public String getKey(String key) {
        ValueOperations<String, String> ops = this.template.opsForValue();

        return ops.get(key);
    }

    public Map<Object, Object> hgetAll(String key) {
        return template.opsForHash().entries(key);
    }

    public void hset(String key, Map<String, String> actors) {
        template.opsForHash().putAll(key, actors);
    }

    public void sendMessage(String channel, String message) {
        template.convertAndSend(channel, message);
    }

    // Methods without Jedis interface
    public Set<String> keys(String pattern) {
        Set<String> redisKeys = template.keys(pattern);
        return redisKeys;
    }

    public void flushDb() {
        template.execute((RedisCallback<Boolean>) conn -> {
            conn.flushDb();
            return null;
        });
    }
}