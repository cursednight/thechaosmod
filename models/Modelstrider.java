// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelstrider extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer right_bristles_1;
	private final ModelRenderer left_bristles_1;
	private final ModelRenderer right_bristles_2;
	private final ModelRenderer left_bristles_2;
	private final ModelRenderer right_bristles_3;
	private final ModelRenderer left_bristles_3;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public Modelstrider() {
		textureWidth = 64;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 7.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-8.0F, -14.0F, -8.0F, 16.0F, 14.0F, 16.0F, 0.0F, false);

		right_bristles_1 = new ModelRenderer(this);
		right_bristles_1.setRotationPoint(-8.0F, -13.0F, 0.0F);
		body.addChild(right_bristles_1);
		setRotationAngle(right_bristles_1, 0.0F, 0.0F, -1.0472F);
		right_bristles_1.setTextureOffset(4, 33).addBox(-12.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);

		left_bristles_1 = new ModelRenderer(this);
		left_bristles_1.setRotationPoint(8.0F, -13.0F, 0.0F);
		body.addChild(left_bristles_1);
		setRotationAngle(left_bristles_1, 0.0F, 0.0F, 1.0472F);
		left_bristles_1.setTextureOffset(4, 33).addBox(0.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, 0.0F, false);

		right_bristles_2 = new ModelRenderer(this);
		right_bristles_2.setRotationPoint(-8.0F, -9.0F, 0.0F);
		body.addChild(right_bristles_2);
		setRotationAngle(right_bristles_2, 0.0F, 0.0F, -1.0472F);
		right_bristles_2.setTextureOffset(4, 49).addBox(-12.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);

		left_bristles_2 = new ModelRenderer(this);
		left_bristles_2.setRotationPoint(8.0F, -9.0F, 0.0F);
		body.addChild(left_bristles_2);
		setRotationAngle(left_bristles_2, 0.0F, 0.0F, 1.0472F);
		left_bristles_2.setTextureOffset(4, 49).addBox(0.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, 0.0F, false);

		right_bristles_3 = new ModelRenderer(this);
		right_bristles_3.setRotationPoint(-8.0F, -4.0F, 0.0F);
		body.addChild(right_bristles_3);
		setRotationAngle(right_bristles_3, 0.0F, 0.0F, -1.0472F);
		right_bristles_3.setTextureOffset(4, 65).addBox(-12.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);

		left_bristles_3 = new ModelRenderer(this);
		left_bristles_3.setRotationPoint(8.0F, -4.0F, 0.0F);
		body.addChild(left_bristles_3);
		setRotationAngle(left_bristles_3, 0.0F, 0.0F, 1.0472F);
		left_bristles_3.setTextureOffset(4, 65).addBox(0.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-4.0F, 7.0F, 0.0F);
		right_leg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.0F, 7.0F, 0.0F);
		left_leg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}