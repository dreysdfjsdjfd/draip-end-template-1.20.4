package net.draip.end.entity.client;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.entity.Entity;

/**
 * Represents the model of shulker-bullet-like entity.
 *
 * <div class="fabric">
 * <table border=1>
 * <caption>Model parts of this model</caption>
 * <tr>
 *   <th>Part Name</th><th>Parent</th><th>Corresponding Field</th>
 * </tr>
 * <tr>
 *   <td>{@value #MAIN}</td><td>{@linkplain #root Root part}</td><td>{@link #bullet}</td>
 * </tr>
 * </table>
 * </div>
 */
@Environment(value=EnvType.CLIENT)
public class ExplosiveShulkerShellEntityModel<T extends Entity>
        extends SinglePartEntityModel<T> {
    /**
     * The key of the main model part, whose value is {@value}.
     */
    private static final String MAIN = "main";
    private final ModelPart root;
    private final ModelPart bullet;

    public ExplosiveShulkerShellEntityModel(ModelPart root) {
        this.root = root;
        this.bullet = root.getChild(MAIN);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild(MAIN, ModelPartBuilder.create().uv(0, 0).cuboid(-4.0f, -4.0f, -1.0f, 8.0f, 8.0f, 2.0f).uv(0, 10).cuboid(-1.0f, -4.0f, -4.0f, 2.0f, 8.0f, 8.0f).uv(20, 0).cuboid(-4.0f, -1.0f, -4.0f, 8.0f, 2.0f, 8.0f), ModelTransform.NONE);
        return TexturedModelData.of(modelData, 64, 32);
    }

    @Override
    public ModelPart getPart() {
        return this.root;
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.bullet.yaw = headYaw * ((float)Math.PI / 180);
        this.bullet.pitch = headPitch * ((float)Math.PI / 180);
    }
}

