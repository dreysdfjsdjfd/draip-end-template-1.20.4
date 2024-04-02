// entity_transparent.glsl

// Vertex shader
#version 150 core
uniform mat4 projectionMatrix;
uniform mat4 modelViewMatrix;
in vec3 aVertexPosition;
in vec2 aTextureCoord;
out vec2 vTextureCoord;
void main() {
    gl_Position = projectionMatrix * modelViewMatrix * vec4(aVertexPosition, 1.0);
    vTextureCoord = aTextureCoord;
}

// Fragment shader
#version 150 core
uniform sampler2D textureSampler;
in vec2 vTextureCoord;
out vec4 fragColor;
void main() {
    vec4 texColor = texture(textureSampler, vTextureCoord);
    fragColor = vec4(texColor.rgb, texColor.a * 0.5); // 50% opacity
}
