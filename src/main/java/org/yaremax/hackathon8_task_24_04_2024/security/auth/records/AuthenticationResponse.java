package org.yaremax.hackathon8_task_24_04_2024.security.auth.records;

import org.yaremax.hackathon8_task_24_04_2024.models.user.Role;

public record AuthenticationResponse(String token,
                                     Role role) {
}
