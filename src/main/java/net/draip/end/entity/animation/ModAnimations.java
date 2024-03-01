package net.draip.end.entity.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class ModAnimations {

    public static final Animation ENDERSNAIL_IDLE = Animation.Builder.create(5.083433f).looping()
            .addBoneAnimation("body",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(1.5416767f, AnimationHelper.createRotationalVector(0f, 0f, 3f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(3.0834335f, AnimationHelper.createRotationalVector(0f, 0f, -3f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(5.083433f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(6.541677f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("shell",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5416767f, AnimationHelper.createRotationalVector(0f, 0f, 2f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(3.0834335f, AnimationHelper.createRotationalVector(0f, 0f, -2f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(5.083433f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_eye",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(1.7083433f, AnimationHelper.createRotationalVector(0f, 0f, -3f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(3.5416765f, AnimationHelper.createRotationalVector(0f, 0f, 3f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(5.083433f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC)))
            .addBoneAnimation("right_eye",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(1.7083433f, AnimationHelper.createRotationalVector(0f, 0f, -3f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(3.75f, AnimationHelper.createRotationalVector(0f, 0f, 3f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(5.083433f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC))).build();
    public static final Animation ENDERSNAIL_WALK = Animation.Builder.create(5f).looping()
            .addBoneAnimation("body",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5834333f, AnimationHelper.createRotationalVector(1f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(3.5f, AnimationHelper.createRotationalVector(-1f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("shell",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5f, AnimationHelper.createRotationalVector(1f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(3.5416765f, AnimationHelper.createRotationalVector(-1f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("left_eye",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5f, AnimationHelper.createRotationalVector(5f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(3.5f, AnimationHelper.createRotationalVector(-5.36f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR)))
            .addBoneAnimation("right_eye",
                    new Transformation(Transformation.Targets.ROTATE,
                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR),
                            new Keyframe(1.5f, AnimationHelper.createRotationalVector(-2.5f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(3.5f, AnimationHelper.createRotationalVector(3.93f, 0f, 0f),
                                    Transformation.Interpolations.CUBIC),
                            new Keyframe(5f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                    Transformation.Interpolations.LINEAR))).build();
}
